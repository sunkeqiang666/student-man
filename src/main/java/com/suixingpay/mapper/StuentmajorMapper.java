package com.suixingpay.mapper;

import com.suixingpay.pojo.Stuentmajor;

public interface StuentmajorMapper {
    int deleteByPrimaryKey(Integer stuid);

    int insert(Stuentmajor record);

    int insertSelective(Stuentmajor record);

    Stuentmajor selectByPrimaryKey(Integer stuid);

    int updateByPrimaryKeySelective(Stuentmajor record);

    int updateByPrimaryKey(Stuentmajor record);
}