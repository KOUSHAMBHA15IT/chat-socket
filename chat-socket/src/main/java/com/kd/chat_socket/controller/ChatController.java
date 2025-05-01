package com.kd.chat_socket.controller;


import com.kd.chat_socket.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ChatController {


    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage msg){
        return msg;
    }

    @GetMapping("chat")
    public String chat(){// for thymeleaf
        return "chat";
    }
}
