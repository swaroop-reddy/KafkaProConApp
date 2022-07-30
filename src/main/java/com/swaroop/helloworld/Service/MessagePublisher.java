package com.swaroop.helloworld.Service;

import com.swaroop.helloworld.Producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagePublisher {
    @Autowired
    KafkaProducer kafkaProducer;

    public void publishMessage(String message){
        kafkaProducer.sendMessage(message);
    }
}
