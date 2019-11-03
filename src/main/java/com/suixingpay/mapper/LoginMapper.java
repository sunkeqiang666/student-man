package com.suixingpay.mapper;

import com.suixingpay.pojo.Login;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface LoginMapper {
    @Update("UPDATE login SET password=#{password} WHERE stuId=#{stuid}")
    int updateStudent(Login login);
    @Select("select stuId,password,mark from login where stuId=#{stuid}")
    Login selectStudentByStuId(int stuid);
}