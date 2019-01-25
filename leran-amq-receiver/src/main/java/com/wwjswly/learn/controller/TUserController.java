package com.wwjswly.learn.controller;


import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.TuserRequest;
import com.wwjswly.learn.api.response.TUserResponse;
import com.wwjswly.learn.entity.TUser;
import com.wwjswly.learn.mq.UserRecelver;
import com.wwjswly.learn.service.TUserService;
import com.wwjswly.learn.service.TUserServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
public class TUserController {

    @Resource
    private TUserServiceClient client;
    @Autowired
    private TUserService userService;
    @Autowired
    private UserRecelver userRecelver;

    @PostMapping("/save")
    public String save() {
        return "success";
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public TUser get(@PathVariable("id") Long id) {
        TUser user = this.userService.getTuserById(id);
        log.debug("User：{}", user);
        return user;
    }

    @RequestMapping(value = "api/user/list",method = RequestMethod.POST)
    public ResponseEntity<TUserResponse> list(@RequestBody TuserRequest userRequest) {
        ResponseEntity<TUserResponse> list = this.client.list(userRequest);
        log.info("fegin返回数据:{}", list);
        return list;
    }




}

