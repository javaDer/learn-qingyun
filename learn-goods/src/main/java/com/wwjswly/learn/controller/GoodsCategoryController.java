package com.wwjswly.learn.controller;


import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.goods.GoodsCategoryRequest;
import com.wwjswly.learn.api.response.goods.GoodsCategoryResponse;
import com.wwjswly.learn.service.GoodsCategoryService;
import com.wwjswly.learn.service.goods.GoodsCategoryClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品种类表 前端控制器
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
@RestController
@Slf4j
@RequestMapping("/goods/category")
@Api(value = "产品服务")
public class GoodsCategoryController implements GoodsCategoryClient {

    @Autowired
    private GoodsCategoryService goodsCategoryService;

    @Override
    @ApiOperation(value = "产品种类列表", notes = "产品种类列表")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", dataType = "GoodsCategoryRequest", name = "request", value = "产品种类列表"),
    })
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ResponseEntity<GoodsCategoryResponse> list(@RequestBody GoodsCategoryRequest request) {
        log.info("list入参：{}", request.toString());
        ResponseEntity<GoodsCategoryResponse> response=  goodsCategoryService.queryList(request);
        return response;
    }

}

