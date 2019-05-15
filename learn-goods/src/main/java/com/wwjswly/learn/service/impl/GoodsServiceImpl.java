package com.wwjswly.learn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwjswly.entity.goods.Goods;
import com.wwjswly.learn.mapper.GoodsMapper;
import com.wwjswly.learn.service.GoodsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

}
