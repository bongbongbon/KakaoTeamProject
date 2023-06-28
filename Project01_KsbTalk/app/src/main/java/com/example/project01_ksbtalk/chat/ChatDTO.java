package com.example.project01_ksbtalk.chat;

import java.io.Serializable;

public class ChatDTO implements Serializable {
    private int resImgID ;
    private String name , context;

    public ChatDTO(int resImgID, String name, String context) {
        this.resImgID = resImgID;
        this.name = name;
        this.context = context;
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

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
