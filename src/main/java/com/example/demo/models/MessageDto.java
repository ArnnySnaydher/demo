package com.example.demo.models;

import java.time.LocalDateTime;

public class MessageDto {

    private LocalDateTime time;
    private String message;

    public MessageDto(LocalDateTime time, String message) {
        this.time = time;
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
