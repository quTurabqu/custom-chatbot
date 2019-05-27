package com.chatbot.customchatbot;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomChatbotApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(CustomChatbotApplication.class, args);
    }

    @Bean
    public Bot bot(@Value("") String path,
                   @Value("${simplebot.name}") String botName){
        path = this.getClass().getResource("/").getPath();
        Bot bot = new Bot(botName, path);
        bot.writeAIMLFiles();
        return bot;
    }

    @Bean
    public Chat chat(Bot bot){
        Chat chat = new Chat(bot);
        return chat;
    }
}
