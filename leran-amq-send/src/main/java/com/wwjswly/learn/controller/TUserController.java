package com.wwjswly.learn.controller;


import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.entity.TUser;
import com.wwjswly.learn.mapper.mongo.repository.UserRepository;
import com.wwjswly.learn.mq.UserSender;
import com.wwjswly.learn.service.TUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wwjswly.learn.api.request.TuserRequest;
import com.wwjswly.learn.api.response.TUserResponse;

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
@Api(value = "用户服务",description = "用户模块")
public class TUserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserSender userSender;
    @Autowired
    private TUserService userService;

    @ApiOperation(value = "保存用户", notes = "保存用户")
    @PostMapping("/save")
    public String save() {
        TUser user = new TUser();
        user.setId(213123121L);
        user.setUserName("zhangsan");
        this.userRepository.save(user);
        userSender.send(user);
        log.debug(user.toString() + "");
        return "success";
    }

    /**
     * 获取用户列表分页
     * @param userRequest
     * @return ResponseEntity<TUserResponse>
     */
    @ApiOperation(value = "用户列表", notes = "查询所有用户信息")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", dataType = "TuserRequest", name = "userRequest",value = "查询所有用户信息"),
    })
    @PostMapping("/list")
    public ResponseEntity<TUserResponse> list(@RequestBody TuserRequest userRequest) {
        return userService.queryList(userRequest);
    }
}

