package com.chatbot.customchatbot.model;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class Message {
    @NotNull
    private String text;
    private Date sentDate;
    private String imgPath;

    public Message(String imgPath,String text) {
        this.text = text;
        this.sentDate = new Date();
        this.imgPath = imgPath;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
