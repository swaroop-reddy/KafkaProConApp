package com.swaroop.helloworld.controller;

import com.swaroop.helloworld.Service.MessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class HelloController {

    @Autowired
    MessagePublisher messagePublisher;

    @GetMapping("/publishMessage/{message}")
    public String publishMessage(@PathVariable("message") String message){
        messagePublisher.publishMessage(message);
        return message;
    }
}
