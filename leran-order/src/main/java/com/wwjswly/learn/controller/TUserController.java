package com.wwjswly.learn.controller;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.http.HttpStatus;
import com.wwjswly.entity.TUser;
import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.UserSaveRequest;
import com.wwjswly.learn.mapper.mongo.repository.UserRepository;
import com.wwjswly.learn.mq.UserSender;
import com.wwjswly.learn.service.TUserService;
import com.wwjswly.learn.service.TUserServiceClient;
import com.wwjswly.learn.service.goods.GoodsClient;
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
@Api(value = "用户服务", description = "用户模块")
public class TUserController implements TUserServiceClient {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserSender userSender;
    @Autowired
    private TUserService userService;
    @Autowired
    private GoodsClient goodsClient;
    /**
     * 获取用户列表分页
     *
     * @param userRequest userRequest
     * @return ResponseEntity<TUserResponse>
     */
    @Override
    @ApiOperation(value = "用户列表", notes = "查询所有用户信息")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", dataType = "TuserRequest", name = "userRequest", value = "查询所有用户信息"),
    })
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ResponseEntity<TUserResponse> list(@RequestBody TuserRequest userRequest) {
        log.info("list入参：{}", userRequest.toString());
        return userService.queryList(userRequest);
    }

    @Override
    @ApiOperation(value = "用户保存", notes = "用户保存信息")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", dataType = "UserSaveRequest", name = "userSaveRequest", value = "保存用户信息"),
    })
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity save(@RequestBody UserSaveRequest userSaveRequest) {
        log.info("save入参：{}", userSaveRequest.toString());
        ResponseEntity response = new ResponseEntity();
        response.setState(HttpStatus.HTTP_OK);
        TUser user = new TUser();
        BeanUtil.copyProperties(userSaveRequest, user);
        boolean save = userService.save(user);
        if(save){
            response.setMessage("保存数据成功");
        }else {
            response.setMessage("保存数据失败");
        }
        response.setSuccess(save);
        return response;
    }
}

