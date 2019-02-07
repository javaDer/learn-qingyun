package com.wwjswly.learn.controller;


import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.service.CloudMusicServiceClient;
import com.wwjswly.music.constant.ConstantCloudMusic;
import com.wwjswly.neteasecloudmusic.request.LoginEmailRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

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
@Api(value = "网易音乐服务", description = "网易音乐服务")
public class CloudMusicController implements CloudMusicServiceClient {
    @Autowired
    private RestTemplate restTemplate;
    final String url = ConstantCloudMusic.CLOUD_MUSIC.NETEASE_CLOUD_MUSIC_URL.getValue();

    @ApiOperation(value = "网易音乐服务", notes = "网易音乐服务")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "query", dataType = "String", name = "keyworld", value = "歌曲关键字"),
    })
    @Override
    public ResponseEntity search(@RequestParam("keyworld") String keyworld) {
        ResponseEntity response = new ResponseEntity();
        String forObject = restTemplate.getForObject(url + "/search?keywords=" + keyworld, String.class);
        JSONObject parse = JSONObject.parseObject(forObject);
        log.info("网易音乐搜索{}", parse);
        response.setData(parse);
        return response;
    }

    @ApiOperation(value = "网易音乐邮箱登录", notes = "网易音乐邮箱登录")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", dataType = "LoginEmailRequest", name = "request", value = "电子邮箱"),
    })
    @Override
    public ResponseEntity loginByEmail(@RequestBody LoginEmailRequest request) {
        ResponseEntity responseEntity = new ResponseEntity();
        String str = restTemplate.getForObject(url + "login?email=" + request.getEmail() + "&password=" + request.getPassword(), String.class);
        JSONObject jobj = JSONObject.parseObject(str);
        log.info("返回信息:{}", jobj);
        responseEntity.setData(jobj);
        return responseEntity;
    }
}