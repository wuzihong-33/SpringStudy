package com.service;



public class ClassInfo {
    private String class_id;
    private String name;

    public String getClass_id() {
        return class_id;
    }

    public String getName() {
        return name;
    }

    public ClassInfo() {
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassInfo(String class_id, String name) {
        this.class_id = class_id;
        this.name = name;
    }


}
