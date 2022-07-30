package com.swaroop.helloworld.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${topic.name.producer}")
    private String topicName;

    public void sendMessage(String message) {
        kafkaTemplate.send(topicName, message)
                .addCallback(
                        result -> System.out.println("Message sent to topic: "+ message),
                        ex -> System.out.println("Failed to send message"+ex)
                );
    }
}
