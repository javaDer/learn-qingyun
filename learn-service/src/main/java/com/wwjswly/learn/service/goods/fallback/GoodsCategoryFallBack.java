package com.wwjswly.learn.service.goods.fallback;

import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.goods.GoodsCategoryRequest;
import com.wwjswly.learn.api.response.goods.GoodsCategoryResponse;
import com.wwjswly.learn.service.goods.GoodsCategoryClient;

/**
 * @author zhaofa
 */
public class GoodsCategoryFallBack implements GoodsCategoryClient {

    @Override
    public ResponseEntity<GoodsCategoryResponse> list(GoodsCategoryRequest request) {
        return null;
    }
}
