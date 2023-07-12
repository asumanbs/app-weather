package com.example.weather.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @KafkaListener(topics ="appTopic", groupId="group_id")
    public void listenMessage(String message){
        System.out.println(message);
    }
}
