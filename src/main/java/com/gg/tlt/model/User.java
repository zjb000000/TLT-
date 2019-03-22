package com.gg.tlt.model;

public class User {

    String nickname;
    String password;
    boolean sex;
    Integer id;
    String roleName;


    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public User(){}
    public User(String nickname, String password, boolean sex, Integer id,String roleName) {

        this.nickname = nickname;
        this.password = password;
        this.sex = sex;
        this.id = id;
        this.roleName = roleName;
    }

}