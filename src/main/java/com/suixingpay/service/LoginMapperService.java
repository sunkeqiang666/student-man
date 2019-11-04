package com.suixingpay.service;

import com.suixingpay.pojo.Login;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface LoginMapperService {
    int updateStudentService(Login login);
    Login selectStudentByStuIdService(int stuid);
}
