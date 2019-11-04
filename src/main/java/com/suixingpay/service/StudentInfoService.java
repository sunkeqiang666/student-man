package com.suixingpay.service;

import com.suixingpay.pojo.Studentinfo;

public interface StudentInfoService {
    Studentinfo selectByPrimaryKey(int id);

    boolean updateStudent(Studentinfo studentinfo);
}
