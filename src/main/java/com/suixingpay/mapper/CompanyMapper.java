package com.suixingpay.mapper;

import com.suixingpay.pojo.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CompanyMapper {
    int deleteByPrimaryKey(Integer comid);

    int insert(Company record);

    int insertSelective(Company record);

    @Select("select * from company where ComId = #{comid}")
    Company selectByPrimaryKey(Integer comid);

    int updateByPrimaryKeySelective(Company record);

    @Update("update company set ComName = #{comname},ComNature = #{comnature},ComIndustry = #{comindustry},ComCode = #{comcode},ComConPeo = #{comconpeo} where ComId = #{comid}")
    int updateByPrimaryKey(Company record);
}