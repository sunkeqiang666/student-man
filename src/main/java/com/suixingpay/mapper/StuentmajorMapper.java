package com.suixingpay.mapper;

import com.suixingpay.pojo.Stuentmajor;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StuentmajorMapper {

    @Update("UPDATE Stuentmajor SET stuCollege=#{stuCollege},stuMajor=#{stuMajor},stuClass=#{stuClass} WHERE stuId=#{stuid}")
    int updateStudent(Stuentmajor Stuentmajor);
    //    password.equals(login.getPassword()) && login.getMark() == 0
    @Select("select stuId,stuCollege,stuMajor,stuClass from Stuentmajor where stuId=#{stuid}")
    Stuentmajor selectStudentByStuId(int stuid);

}