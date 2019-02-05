package com.onlineshop;

import java.util.*;
//import java.util.Arrays;

public abstract class User {
    //ArrayList<String>userid=new ArrayList<String>();
    //ArrayList<String>password=new ArrayList<String>();
    String userid;
    String password;
    String loginStatus;
    //ArrayList<User> arrUser=new ArrayList<User>();

    /*public User(String uid,String pass,String logstat)  //setting login,pass n type
    {
        this.userid=uid;
        this.password=pass;
        this.loginStatus=logstat;
        //arrUser.add(this);
    }*/

    abstract boolean verifyLogin(String uid, String pass); //to be used by other classes

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }
}
