package com.wwjswly.learn.mq;

import com.wwjswly.learn.entity.TUser;
import com.wwjswly.learn.service.TUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jack
 */
@Component
@Slf4j
public class UserRecelver {
    @Autowired
    private TUserService userService;

    @RabbitListener(queues = "queue")
    public void recelver(TUser user) {
        log.debug("rabbirmq接受信息实体" + user);
        this.userService.save(user);
    }

}
