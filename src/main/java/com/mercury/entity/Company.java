package com.mercury.entity;

import org.springframework.beans.factory.annotation.Value;

public class Company {

    @Value("EMC")
    private String name;
    @Value("1001")
    private  int id;
    @Value("YangPu-Shanghai-China")
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                '}';
    }
}
