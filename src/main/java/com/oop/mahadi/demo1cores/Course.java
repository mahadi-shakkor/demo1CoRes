package com.oop.mahadi.demo1cores;

public class Course {
    String name,type;
    Integer sec,cer;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sec=" + sec +
                ", cer=" + cer +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSec() {
        return sec;
    }

    public void setSec(Integer sec) {
        this.sec = sec;
    }

    public Integer getCer() {
        return cer;
    }

    public void setCer(Integer cer) {
        this.cer = cer;
    }

    public Course() {
    }

    public Course(String name, String type, Integer sec, Integer cer) {
        this.name = name;
        this.type = type;
        this.sec = sec;
        this.cer = cer;
    }
}
