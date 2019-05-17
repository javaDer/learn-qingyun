package com.wwjswly.learn.service.goods.fallback;

import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.goods.GoodsRequest;
import com.wwjswly.learn.api.vo.goods.GoodsVo;
import com.wwjswly.learn.service.goods.GoodsClient;

/**
 * GoodsFallBack
 *
 * @author ZhaoFa
 * @date 2019-05-17 14:50
 **/
public class GoodsFallBack implements GoodsClient {
    @Override
    public ResponseEntity<GoodsVo> list(GoodsRequest request) {
        return null;
    }
}
