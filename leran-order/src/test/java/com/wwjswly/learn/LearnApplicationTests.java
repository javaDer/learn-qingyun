package com.wwjswly.learn;

import com.wwjswly.entity.TUser;
import com.wwjswly.learn.service.TUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnApplicationTests {
    @Autowired
    private TUserService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void save() {
        LocalDateTime time = LocalDateTime.now();
        List<TUser> list = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            TUser user = new TUser(Long.valueOf(i), "zhangsan" + i, "1769352" + i, "fa2009100" + i + "@163.com", "sawdke34fe" + i, "he" + i, time, time, 1, "23131123");
            list.add(user);
        }
        userService.saveBatch(list);
    }
}

