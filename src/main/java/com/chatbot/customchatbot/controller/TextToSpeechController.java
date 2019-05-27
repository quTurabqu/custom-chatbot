package com.chatbot.customchatbot.controller;

import com.chatbot.customchatbot.service.TextToSpeechService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/voice")
public class TextToSpeechController {

    private TextToSpeechService textToSpeechService ;

    public TextToSpeechController(TextToSpeechService textToSpeechService) {
        this.textToSpeechService = textToSpeechService;
    }

    @GetMapping("/{text}")
    public void textToSpeeach(@PathVariable("text") String text){
        textToSpeechService.textToSpeech(text);
    }
}
