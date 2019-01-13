package com.wwjswly.learn.controller;


import com.wwjswly.learn.entity.TUser;
import com.wwjswly.learn.mapper.mongo.repository.UserRepository;
import com.wwjswly.learn.mq.UserRecelver;
import com.wwjswly.learn.service.TUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhangzhaofa
 * @since 2018-12-15
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class TUserController {

    @Autowired
    private TUserService userService;
    @Autowired
    private UserRecelver userRecelver;

    @RequestMapping("/save")
    public String save() {
        return "success";
    }

    @RequestMapping("/get/{id}")
    @ResponseBody
    public TUser get(@PathVariable("id") Long id) {
        TUser user = this.userService.getTuserById(id);
        log.debug("User：{}", user);
        return user;
    }

}

