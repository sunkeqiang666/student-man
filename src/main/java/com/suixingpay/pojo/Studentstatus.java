package com.suixingpay.pojo;

import java.util.Date;

public class Studentstatus {
    private Integer stuid;//学号

    private Date stuIn;//入学时间

    private Date stuOut;//毕业时间

    private String stuBeforeschool;//生源所在地

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Date getStuIn() {
        return stuIn;
    }

    public void setStuIn(Date stuIn) {
        this.stuIn = stuIn;
    }

    public Date getStuOut() {
        return stuOut;
    }

    public void setStuOut(Date stuOut) {
        this.stuOut = stuOut;
    }

    public String getStuBeforeschool() {
        return stuBeforeschool;
    }

    public void setStuBeforeschool(String stuBeforeschool) {
        this.stuBeforeschool = stuBeforeschool == null ? null : stuBeforeschool.trim();
    }
}