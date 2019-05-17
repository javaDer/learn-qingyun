package com.wwjswly.learn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwjswly.entity.goods.Goods;
import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.goods.GoodsRequest;
import com.wwjswly.learn.api.vo.goods.GoodsVo;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
public interface GoodsService extends IService<Goods> {

    ResponseEntity<GoodsVo> queryList(GoodsRequest request);
}
