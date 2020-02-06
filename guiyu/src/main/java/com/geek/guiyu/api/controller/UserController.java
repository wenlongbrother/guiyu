package com.geek.guiyu.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.geek.guiyu.domain.dataobject.LoginDTO;
import com.geek.guiyu.domain.dataobject.PhoneDTO;
import com.geek.guiyu.domain.dataobject.RegisterDTO;
import com.geek.guiyu.domain.exception.AlreadyRegisterException;
import com.geek.guiyu.domain.exception.NoPhoneException;
import com.geek.guiyu.domain.exception.ShortMessageException;
import com.geek.guiyu.service.UserServce;
import com.geek.guiyu.service.util.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {
    @Autowired
    UserServce userServce;

    @GetMapping("/getShortMessage")
    public JSONObject getShortMessage(PhoneDTO phoneDTO) throws AlreadyRegisterException, NoPhoneException {
        return JSONUtils.success(userServce.shortMessage(phoneDTO));
    }

    @PostMapping("/register")
    public JSONObject register(@RequestBody RegisterDTO registerDTO) throws ShortMessageException {
        return JSONUtils.success(userServce.register(registerDTO));
    }

    @PostMapping("/login")
    public JSONObject login(@RequestBody LoginDTO loginDTO) throws ShortMessageException, NoPhoneException {
        return JSONUtils.success(userServce.login(loginDTO));
    }
}
