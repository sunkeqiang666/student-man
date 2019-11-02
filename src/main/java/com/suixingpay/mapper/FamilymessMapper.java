package com.suixingpay.mapper;

import com.suixingpay.pojo.Familymess;

public interface FamilymessMapper {
    int deleteByPrimaryKey(Integer stuid);

    int insert(Familymess record);

    int insertSelective(Familymess record);

    Familymess selectByPrimaryKey(Integer stuid);

    int updateByPrimaryKeySelective(Familymess record);

    int updateByPrimaryKey(Familymess record);
}