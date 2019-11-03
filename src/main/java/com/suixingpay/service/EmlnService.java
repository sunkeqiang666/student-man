package com.suixingpay.service;

import com.suixingpay.pojo.Company;
import com.suixingpay.pojo.Empeinf;

public interface EmlnService {
    public Empeinf getCompanyId(int studentId);
    public Company getCompany(int companyId);
    public int updateCompanyById(Company company);
}
