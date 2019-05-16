package com.wwjswly.learn.service.goods;

import com.wwjswly.entity.goods.GoodsCategory;
import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.goods.GoodsCategoryRequest;
import com.wwjswly.learn.api.response.goods.GoodsCategoryResponse;
import com.wwjswly.learn.service.goods.fallback.GoodsCategoryFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "learn-goods",fallback = GoodsCategoryFallBack.class )
public interface GoodsCategoryClient {
    @RequestMapping(value = "/goods/category/list",method = RequestMethod.POST)
    ResponseEntity<GoodsCategoryResponse>list(@RequestBody GoodsCategoryRequest request );
}
