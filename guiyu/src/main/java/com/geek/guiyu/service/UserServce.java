package com.geek.guiyu.service;

import com.geek.guiyu.domain.dataobject.*;
import com.geek.guiyu.domain.exception.AlreadyRegisterException;
import com.geek.guiyu.domain.exception.NoPhoneException;
import com.geek.guiyu.domain.exception.ShortMessageException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserServce {
    MessageDTO shortMessage(PhoneDTO phoneDTO) throws AlreadyRegisterException, NoPhoneException;
    TokenDTO register(RegisterDTO registerDTO) throws ShortMessageException;
    TokenDTO login(LoginDTO loginDTO) throws ShortMessageException, NoPhoneException;
}
