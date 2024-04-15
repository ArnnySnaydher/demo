package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.MessageDto;

@RestController
public class MessageController {

    @GetMapping("/api/message")
    public MessageDto messageView() {
        return new MessageDto(LocalDateTime.now(), "Hello World");
    }
}
