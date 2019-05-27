package com.chatbot.customchatbot.service;

import org.alicebot.ab.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private Chat chatSession;

    @Autowired
    public ChatService(Chat chatSession) {
        this.chatSession = chatSession;
    }

    public String getChatResponse(String request) {
        return chatSession.multisentenceRespond(request);
    }
}
