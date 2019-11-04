package com.suixingpay.pojo;

import java.util.List;

public class Stuentmajor {
    private Integer stuid;//学号

    private String stuCollege;//所在院系

    private String stuMajor;//专业名称



    private String stuClass;//所在班级

    private String stuType;



    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuType() {
        return stuType;
    }

    public void setStuType(String stuType) {
        this.stuType = stuType == null ? null : stuType.trim();
    }

    public String getStuCollege() {
        return stuCollege;
    }

    public void setStuCollege(String stuCollege) {
        this.stuCollege = stuCollege == null ? null : stuCollege.trim();
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor == null ? null : stuMajor.trim();
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass == null ? null : stuClass.trim();
    }
    @Override
    public String toString() {
        return "Stuentmajor{" +
                "stuid=" + stuid +
                ", stuCollege='" + stuCollege + '\'' +
                ", stuMajor='" + stuMajor + '\'' +
                ", stuClass='" + stuClass + '\'' +
                ", stuType='" + stuType + '\'' +
                '}';
    }

}