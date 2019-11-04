package com.suixingpay.mapper;

import com.suixingpay.pojo.Empeinf;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.apache.ibatis.annotations.Select;

public interface EmpeinfMapper {
    int deleteByPrimaryKey(Integer empid);

    int insert(Empeinf record);

    int insertSelective(Empeinf record);

    Empeinf selectByPrimaryKey(Integer empid);

    int updateByPrimaryKeySelective(Empeinf record);

    int updateByPrimaryKey(Empeinf record);

    @Select("select * from empeinf where Stuid = #{stuId}")
    Empeinf selectCompanyIdByStuId(int stuId);
}