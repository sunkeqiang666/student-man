package com.suixingpay.mapper;

import com.suixingpay.pojo.Empeinf;

public interface EmpeinfMapper {
    int deleteByPrimaryKey(Integer empid);

    int insert(Empeinf record);

    int insertSelective(Empeinf record);

    Empeinf selectByPrimaryKey(Integer empid);

    int updateByPrimaryKeySelective(Empeinf record);

    int updateByPrimaryKey(Empeinf record);
}