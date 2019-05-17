package com.wwjswly.learn.controller;


import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.goods.GoodsRequest;
import com.wwjswly.learn.api.vo.goods.GoodsVo;
import com.wwjswly.learn.service.GoodsService;
import com.wwjswly.learn.service.goods.GoodsClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 商品表 前端控制器
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
@RestController
@Slf4j
@Api(value = "产品服务", tags = "产品服务")
@CrossOrigin(origins = "*")
public class GoodsController implements GoodsClient {

    @Autowired
    private GoodsService goodsService;

    @Override
    @RequestMapping(value = "/goods/list", method = RequestMethod.POST)
    @ApiOperation(value = "产品种类列表", notes = "产品种类列表")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", dataType = "GoodsRequest", name = "request", value = "产品列表"),
    })
    public ResponseEntity<GoodsVo> list(@RequestBody GoodsRequest request) {
        log.info("list入参：{}", request.toString());
        ResponseEntity<GoodsVo> response = goodsService.queryList(request);
        return response;
    }
}

