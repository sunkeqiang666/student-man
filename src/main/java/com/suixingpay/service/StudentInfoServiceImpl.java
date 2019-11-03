package com.suixingpay.service;

import com.suixingpay.mapper.StudentinfoMapper;
import com.suixingpay.pojo.Studentinfo;
import com.suixingpay.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {
    @Autowired
    StudentinfoMapper studentinfoMapper;

    @Override
    public Studentinfo selectByPrimaryKey(int id) {
        return studentinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateStudent(Studentinfo studentinfo) {
        return studentinfoMapper.updateStudent(studentinfo);
    }
}
