package com.suixingpay.pojo;

import java.util.Date;

public class Studentinfo {
    private Integer stuid;

    private String stuname;

    private Integer stusex;

    private String nation;

    private Date birthdata;

    private String idcard;

    private Integer onechild;

    private String stuphone;

    private String email;

    private Integer qqnumber;

    private Integer fudaoyuanid;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public Integer getStusex() {
        return stusex;
    }

    public void setStusex(Integer stusex) {
        this.stusex = stusex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public Date getBirthdata() {
        return birthdata;
    }

    public void setBirthdata(Date birthdata) {
        this.birthdata = birthdata;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Integer getOnechild() {
        return onechild;
    }

    public void setOnechild(Integer onechild) {
        this.onechild = onechild;
    }

    public String getStuphone() {
        return stuphone;
    }

    public void setStuphone(String stuphone) {
        this.stuphone = stuphone == null ? null : stuphone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getQqnumber() {
        return qqnumber;
    }

    public void setQqnumber(Integer qqnumber) {
        this.qqnumber = qqnumber;
    }

    public Integer getFudaoyuanid() {
        return fudaoyuanid;
    }

    public void setFudaoyuanid(Integer fudaoyuanid) {
        this.fudaoyuanid = fudaoyuanid;
    }
}