package com.deng.pojo;

import java.io.Serializable;
import java.util.List;


public class User implements Serializable{

    private String name;

    private String icon;

    private List<String> collect;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<String> getCollect() {
        return collect;
    }

    public void setCollect(List<String> collect) {
        this.collect = collect;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", collect=" + collect +
                '}';
    }
}
