package com.swaroop.helloworld.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "ExampleTopic", groupId="group_id")
    void listener(String data) {
        System.out.println("Data Received: "+data);
    }
}
