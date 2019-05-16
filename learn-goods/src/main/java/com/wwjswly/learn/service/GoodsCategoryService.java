package com.wwjswly.learn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwjswly.entity.goods.GoodsCategory;
import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.goods.GoodsCategoryRequest;
import com.wwjswly.learn.api.response.goods.GoodsCategoryResponse;

/**
 * <p>
 * 商品种类表 服务类
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
public interface GoodsCategoryService extends IService<GoodsCategory> {

    ResponseEntity<GoodsCategoryResponse> queryList(GoodsCategoryRequest request);
}
