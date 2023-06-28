package com.example.project01_ksbtalk.friend;

import java.io.Serializable;

public class FriendDTO implements Serializable {

    private int resImgID ;
    private String name , msg;

    public FriendDTO(int resImgID, String name, String msg) {
        this.resImgID = resImgID;
        this.name = name;
        this.msg = msg;
    }

    public int getResImgID() {
        return resImgID;
    }

    public void setResImgID(int resImgID) {
        this.resImgID = resImgID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
