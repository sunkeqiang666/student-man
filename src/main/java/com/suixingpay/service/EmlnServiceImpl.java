package com.suixingpay.service;

import com.suixingpay.mapper.CompanyMapper;
import com.suixingpay.mapper.EmpeinfMapper;
import com.suixingpay.pojo.Company;
import com.suixingpay.pojo.Empeinf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmlnServiceImpl implements EmlnService {
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private EmpeinfMapper empeinfMapper;
    //根据学生id查到 学生-公司表
    public Empeinf getCompanyId(int studentId){
        Empeinf empeinf = empeinfMapper.selectCompanyIdByStuId(studentId);
        return empeinf;
    }

    //根据公司id查到公司信息
    public Company getCompany(int companyId){
        Company company = companyMapper.selectByPrimaryKey(companyId);
        return company;
    }



    //根据公司id修改公司信息
    @Override
    public int updateCompanyById(Company company) {
        int i = companyMapper.updateByPrimaryKey(company);
        return i;
    }
}
