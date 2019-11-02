package com.suixingpay.pojo;

public class Familymess {
    private Integer stuid;

    private String parname;

    private String parphone;

    private String parSturelationship;

    private String poorgrades;

    private String homeaddr;

    private String poladdr;

    private Integer polcode;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getParname() {
        return parname;
    }

    public void setParname(String parname) {
        this.parname = parname == null ? null : parname.trim();
    }

    public String getParphone() {
        return parphone;
    }

    public void setParphone(String parphone) {
        this.parphone = parphone == null ? null : parphone.trim();
    }

    public String getParSturelationship() {
        return parSturelationship;
    }

    public void setParSturelationship(String parSturelationship) {
        this.parSturelationship = parSturelationship == null ? null : parSturelationship.trim();
    }

    public String getPoorgrades() {
        return poorgrades;
    }

    public void setPoorgrades(String poorgrades) {
        this.poorgrades = poorgrades == null ? null : poorgrades.trim();
    }

    public String getHomeaddr() {
        return homeaddr;
    }

    public void setHomeaddr(String homeaddr) {
        this.homeaddr = homeaddr == null ? null : homeaddr.trim();
    }

    public String getPoladdr() {
        return poladdr;
    }

    public void setPoladdr(String poladdr) {
        this.poladdr = poladdr == null ? null : poladdr.trim();
    }

    public Integer getPolcode() {
        return polcode;
    }

    public void setPolcode(Integer polcode) {
        this.polcode = polcode;
    }
}