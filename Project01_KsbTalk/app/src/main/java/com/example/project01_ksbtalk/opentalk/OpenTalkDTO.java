package com.example.project01_ksbtalk.opentalk;

public class OpenTalkDTO {
    private int imgRes , PeopleCnt;
    private String ChatTitle, ChatContext, time;

    public OpenTalkDTO(int imgRes, int peopleCnt, String chatTitle, String chatContext, String time) {
        this.imgRes = imgRes;
        PeopleCnt = peopleCnt;
        ChatTitle = chatTitle;
        ChatContext = chatContext;
        this.time = time;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public int getPeopleCnt() {
        return PeopleCnt;
    }

    public void setPeopleCnt(int peopleCnt) {
        PeopleCnt = peopleCnt;
    }

    public String getChatTitle() {
        return ChatTitle;
    }

    public void setChatTitle(String chatTitle) {
        ChatTitle = chatTitle;
    }

    public String getChatContext() {
        return ChatContext;
    }

    public void setChatContext(String chatContext) {
        ChatContext = chatContext;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
