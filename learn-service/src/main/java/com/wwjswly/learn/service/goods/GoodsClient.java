package com.wwjswly.learn.service.goods;

import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.goods.GoodsCategoryRequest;
import com.wwjswly.learn.api.request.goods.GoodsRequest;
import com.wwjswly.learn.api.vo.goods.GoodsVo;
import com.wwjswly.learn.service.goods.fallback.GoodsCategoryFallBack;
import com.wwjswly.learn.service.goods.fallback.GoodsFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * GoodsClient
 *
 * @author ZhaoFa
 * @date 2019-05-17 14:41
 **/
@FeignClient(value = "learn-goods", fallback = GoodsFallBack.class)
public interface GoodsClient {
    @RequestMapping(value = "/goods/list", method = RequestMethod.POST)
    ResponseEntity<GoodsVo> list(@RequestBody GoodsRequest request);
}

