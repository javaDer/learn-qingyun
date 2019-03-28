package com.wwjswly.learn.service.Rabbitmq;

import com.rabbitmq.client.Channel;
import com.wwjswly.learn.api.vo.TUserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class UserReceiverService {
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "user-queue", durable = "true"),
            exchange = @Exchange(name = "user-exchange", durable = "true", type = "topic"),
            key = "user.*"
    ))
    @RabbitHandler
    public void onUserMessage(@Payload TUserVo user, @Headers Map<String, Object> headers, Channel channel) {
        log.info("获得消息messageId：{}", user.getMessageId());
        Long deliveryTag = (Long) headers.get(AmqpHeaders.DELIVERY_TAG);
//            channel.basicAck(deliveryTag, false);

    }
}
