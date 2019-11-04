package com.suixingpay.service;

import com.suixingpay.pojo.Stuentmajor;

public interface StuentMajorMapperService {

    int updateStudentService(Stuentmajor Stuentmajorr);
    Stuentmajor selectStudentByStuIdService(int stuid);
}
