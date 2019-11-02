package com.suixingpay.mapper;

import com.suixingpay.pojo.Studentinfo;

import java.util.List;

public interface StudentinfoMapper {
    List<Studentinfo> showStudentAll();

    int deleStudentById(int stuid);

    int updateStudent(Studentinfo studentinfo);

    int addStudent(Studentinfo studentinfo);
}