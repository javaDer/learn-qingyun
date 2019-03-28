package com.wwjswly.learn.mq;

import com.wwjswly.entity.TUser;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(TUser user) {
        amqpTemplate.convertAndSend("queue", user);
    }
}
