package com.oop.mahadi.demo1cores;

public class DemoClass {

    String id,hsc,addc,prc,info;

    public DemoClass() {
    }

    @Override
    public String toString() {
        return "DemoClass{" +
                "id='" + id + '\'' +
                ", hsc='" + hsc + '\'' +
                ", addc='" + addc + '\'' +
                ", prc='" + prc + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public String getPrc() {
        return prc;
    }

    public void setPrc(String prc) {
        this.prc = prc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHsc() {
        return hsc;
    }

    public void setHsc(String hsc) {
        this.hsc = hsc;
    }

    public String getAddc() {
        return addc;
    }

    public void setAddc(String addc) {
        this.addc = addc;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public DemoClass(String id, String hsc, String addc, String prc, String info) {
        this.id = id;
        this.hsc = hsc;
        this.addc = addc;
        this.prc = prc;
        this.info = info;
    }
}
