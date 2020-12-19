package com.mryu.devstudy.utils;

import java.io.Serializable;

public class PermissionPolicy implements Serializable {
    private int id;
    private String[] permission;
    private int icon;
    private String title;
    private String des;
    private boolean request;

    public boolean isRequest() {
        return request;
    }

    public void setRequest(boolean request) {
        this.request = request;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getPermission() {
        return permission;
    }

    public void setPermission(String... permission) {
        this.permission = permission;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    private String[] getStringsOneDimensional(String... strings) {
        String[] string;
        string = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            string[i] = strings[i];
        }
        return string;
    }
}
