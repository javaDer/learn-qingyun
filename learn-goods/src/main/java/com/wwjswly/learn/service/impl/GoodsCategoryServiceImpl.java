package com.wwjswly.learn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwjswly.entity.goods.GoodsCategory;
import com.wwjswly.learn.mapper.GoodsCategoryMapper;
import com.wwjswly.learn.service.GoodsCategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品种类表 服务实现类
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
@Service
public class GoodsCategoryServiceImpl extends ServiceImpl<GoodsCategoryMapper, GoodsCategory> implements GoodsCategoryService {

}
