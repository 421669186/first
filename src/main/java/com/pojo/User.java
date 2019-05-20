package com.pojo;

/**
 * @author lcy
 * @version V1.0
 * @Package com.pojo
 * @date 2019/5/20 10:17
 * @Copyright © 华据
 */
public class User {
    private long id;
    private String userName;
    private String userNum;
    private String userPassWord;
    private int plevel;

    public int getPlevel() {
        return plevel;
    }

    public void setPlevel(int plevel) {
        this.plevel = plevel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }


}
