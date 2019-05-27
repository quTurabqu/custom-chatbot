package com.chatbot.customchatbot.controller;

import com.chatbot.customchatbot.model.Message;
import com.chatbot.customchatbot.service.ChatService;
import com.chatbot.customchatbot.service.TextToSpeechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/chatbot")
public class BotController {

    private ChatService chatService;
    private TextToSpeechService textToSpeechService;

    @Autowired
    public BotController(ChatService chatService, TextToSpeechService textToSpeechService) {
        this.chatService = chatService;
        this.textToSpeechService = textToSpeechService;
    }

    @GetMapping("/contact/{request}")
    public String getAnswer(@PathVariable("request") String request){
        String answer = chatService.getChatResponse(request);
        return answer;
    }

    @GetMapping("/{text}")
    public Message hello(@PathVariable("text") String text){
        String answer = chatService.getChatResponse(text);
        textToSpeechService.textToSpeech(answer);
        return new Message("../../assets/img/bot.jpg", answer);
    }
}
