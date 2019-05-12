package com.wwjswly.learn.service.rabbitmq;

import com.wwjswly.learn.api.vo.TUserVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserSendServiceTest {
    @Autowired
    private UserSendService userSendService;

    @Test
    public void sendSaveUser() {
        for (int i = 0; i <20 ; i++) {
            TUserVo vo = new TUserVo();
            vo.setMessageId(System.currentTimeMillis() + "");
            userSendService.sendSaveUser(vo);
        }

    }
}