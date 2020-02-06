package com.geek.guiyu.service.impl;

import com.amazonaws.services.dynamodbv2.xspec.S;
import com.geek.guiyu.domain.dataobject.*;
import com.geek.guiyu.domain.exception.AlreadyRegisterException;
import com.geek.guiyu.domain.exception.NoPhoneException;
import com.geek.guiyu.domain.exception.ShortMessageException;
import com.geek.guiyu.domain.model.UserInfo;
import com.geek.guiyu.infrastructure.dao.UserInfoMapper;
import com.geek.guiyu.service.UserServce;
import com.geek.guiyu.service.util.ShortMessageUtil;
import com.geek.guiyu.service.util.TokenUtils;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Service
public class UserServiceImpl implements UserServce {
    @Autowired
    private ShortMessageUtil shortMessageUtil;
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private Mapper dozerMapper;
    @Autowired
    private TokenUtils tokenUtils;
    /**
     * 用来保存短信
     */
    private static ConcurrentHashMap<String, String> shortMessageMap = new ConcurrentHashMap<>();
    /**
     * 发送短信
     * @param phoneDTO 手机号
     * @return
     * @throws AlreadyRegisterException
     */
    @Override
    public MessageDTO shortMessage(PhoneDTO phoneDTO) throws AlreadyRegisterException, NoPhoneException {
        String phone = phoneDTO.getPhone();
        String type = phoneDTO.getType();
        String shortMessage;
        if(type == "register"){
            // 如果存在此账号，抛出AlreadyRegisterException异常
            if(userInfoMapper.selectByPhone(phone) != null){
                throw new AlreadyRegisterException();
            }
        }
        if(type == "login"){
            if(userInfoMapper.selectByPhone(phone) == null){
                throw new NoPhoneException();
            }
        }
        shortMessage = shortMessageUtil.sendShortMessage(phone);
        shortMessageMap.put(phone, shortMessage);
        return new MessageDTO(shortMessage);
    }

    /**
     * 注册
     * @param registerDTO
     * @return
     */
    @Override
    public TokenDTO register(RegisterDTO registerDTO) throws ShortMessageException {
        // 获得短信
        String shortMessage = registerDTO.getShortMessage();
        // 获得手机号
        String phone = registerDTO.getPhone();
        if(!shortMessage.equals(shortMessageMap.get(phone))){
            throw new ShortMessageException();
        }
        UserInfo userInfo = dozerMapper.map(registerDTO, UserInfo.class);
        userInfo.setDeleted((byte) 0);
        userInfo.setFans(0);
        userInfo.setNickName("小萌新");
        userInfoMapper.insert(userInfo);
        shortMessageMap.remove(phone);
        return tokenUtils.createToken(userInfo);
    }

    @Override
    public TokenDTO login(LoginDTO loginDTO) throws ShortMessageException, NoPhoneException {
        String phone = loginDTO.getPhone();
        String message = loginDTO.getShortMessage();
        if(userInfoMapper.selectByPhone(phone) == null){
            throw new NoPhoneException();
        }
        // 如果与发送的短信不一致
        if(!message.equals(shortMessageMap.get(phone))){
            throw new ShortMessageException();
        }
        UserInfo userInfo = new UserInfo();
        userInfo.setPhone(phone);
        shortMessageMap.remove(phone);
        return tokenUtils.createToken(userInfo);
    }
}
