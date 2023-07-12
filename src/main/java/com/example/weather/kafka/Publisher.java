package com.example.weather.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Publisher {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public Publisher(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(String message){
        kafkaTemplate.send("appTopic",message);
    }

}
