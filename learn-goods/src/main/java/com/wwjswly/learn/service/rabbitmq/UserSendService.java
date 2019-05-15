package com.wwjswly.learn.service.rabbitmq;

import com.wwjswly.learn.api.vo.TUserVo;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSendService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendSaveUser(TUserVo user) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(user.getMessageId());
        rabbitTemplate.convertAndSend("user-exchange", "user.abcd", user, correlationData);
    }
}
