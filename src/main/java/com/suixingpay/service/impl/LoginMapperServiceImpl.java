package com.suixingpay.service.impl;

import com.suixingpay.mapper.LoginMapper;
import com.suixingpay.pojo.Login;
import com.suixingpay.service.LoginMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginMapperServiceImpl implements LoginMapperService {
    @Autowired
    LoginMapper loginMapper;
    @Override
    public int updateStudentService(Login login) {
        return loginMapper.updateStudent(login);
    }

    @Override
    public Login selectStudentByStuIdService(int stuid) {
        return loginMapper.selectStudentByStuId(stuid);
    }
}
