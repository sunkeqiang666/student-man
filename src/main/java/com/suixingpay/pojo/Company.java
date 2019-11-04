package com.suixingpay.pojo;

public class Company {
    private Integer comid;

    private String comname;

    private String comnature;

    private String comindustry;

    private String comcode;

    private String comconpeo;

    public Integer getComid() {
        return comid;
    }

    public void setComid(Integer comid) {
        this.comid = comid;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname == null ? null : comname.trim();
    }

    public String getComnature() {
        return comnature;
    }

    public void setComnature(String comnature) {
        this.comnature = comnature == null ? null : comnature.trim();
    }

    public String getComindustry() {
        return comindustry;
    }

    public void setComindustry(String comindustry) {
        this.comindustry = comindustry == null ? null : comindustry.trim();
    }

    public String getComcode() {
        return comcode;
    }

    public void setComcode(String comcode) {
        this.comcode = comcode == null ? null : comcode.trim();
    }

    public String getComconpeo() {
        return comconpeo;
    }

    public void setComconpeo(String comconpeo) {
        this.comconpeo = comconpeo == null ? null : comconpeo.trim();
    }

    @Override
    public String toString() {
        return "Company{" +
                "comid=" + comid +
                ", comname='" + comname + '\'' +
                ", comnature='" + comnature + '\'' +
                ", comindustry='" + comindustry + '\'' +
                ", comcode='" + comcode + '\'' +
                ", comconpeo='" + comconpeo + '\'' +
                '}';
    }
}