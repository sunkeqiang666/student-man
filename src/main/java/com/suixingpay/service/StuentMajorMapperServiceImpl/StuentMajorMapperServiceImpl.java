package com.suixingpay.service.StuentMajorMapperServiceImpl;

import com.suixingpay.mapper.StuentmajorMapper;
import com.suixingpay.pojo.Stuentmajor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuentMajorMapperServiceImpl implements StuentmajorMapper {

    @Autowired
    StuentmajorMapper StuentmajorrMapper;
    @Override
    public int updateStudent(Stuentmajor Stuentmajor) {
        return StuentmajorrMapper.updateStudent(Stuentmajor);
    }

    @Override
    public Stuentmajor selectStudentByStuId(int stuid) {
        return StuentmajorrMapper.selectStudentByStuId(stuid);
    }
}
