package com.suixingpay.mapper;

import com.suixingpay.pojo.Studentinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
@Mapper
public interface StudentinfoMapper {
    List<Studentinfo> showStudentAll();

    int deleStudentById(int stuid);
    @Update("update studentinfo set StuName = #{stuname},StuSex = #{stusex},Nation = #{nation},BirthData = #{birthdata},IdCard = #{idcard},OneChild = #{onechild},StuPhone = #{stuphone},\n" +
            "Email = #{email},QqNumber = #{qqnumber} where StuId = #{stuid}")
    boolean updateStudent(Studentinfo studentinfo);

    int addStudent(Studentinfo studentinfo);

    @Select("select  StuId, StuName, StuSex, Nation, BirthData, IdCard, OneChild, StuPhone, Email, QqNumber, FuDaoYuanId from studentinfo where StuId = #{id}")
    Studentinfo selectByPrimaryKey(int id);

}