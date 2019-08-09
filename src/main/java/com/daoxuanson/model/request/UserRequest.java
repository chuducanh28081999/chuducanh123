package com.daoxuanson.model.request;

import java.util.ArrayList;
import java.util.List;

public class UserRequest {
    private String userName;
    private String password;
    private List<Long> ids= new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }
}
