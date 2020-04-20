package com.xinfa.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Account implements Serializable {
    private String username;
    private String password;
    private Double money;
//    private User user;
    private List<User> listtest;
    private Map<String ,User> map;

    /**
     * account有一个User属性该怎嘛办呢？表单提交的name属性写user.uname
     * @return
     */


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public List<User> getListtest() {
        return listtest;
    }

    public void setListtest(List<User> listtest) {
        this.listtest = listtest;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", listtest=" + listtest +
                ", map=" + map +
                '}';
    }
}
