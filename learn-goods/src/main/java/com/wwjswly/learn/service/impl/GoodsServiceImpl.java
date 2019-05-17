package com.wwjswly.learn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwjswly.entity.goods.Goods;
import com.wwjswly.entity.goods.GoodsCategory;
import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.goods.GoodsRequest;
import com.wwjswly.learn.api.response.goods.GoodsResponse;
import com.wwjswly.learn.api.utils.ListUtils;
import com.wwjswly.learn.api.vo.goods.GoodsVo;
import com.wwjswly.learn.mapper.GoodsMapper;
import com.wwjswly.learn.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
@Service
@Slf4j
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {
    @Override
    public ResponseEntity<GoodsVo> queryList(GoodsRequest request) {
        ResponseEntity response = new ResponseEntity();
        response.setState(HttpStatus.OK.value());
        GoodsResponse responseData = new GoodsResponse();
        Long current = request.getCurrent() == 0 ? 1 : request.getCurrent();
        Long size = request.getSize() == 0 ? 10 : request.getSize();
        IPage<Goods> page = new Page<>(current, size);
        QueryWrapper<Goods> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(request.getGoodsId() != 0L, "goods_id", request.getGoodsId());
        IPage<Goods> data = this.baseMapper.selectPage(page, queryWrapper);
        List<Goods> list = data.getRecords();
        if (CollectionUtils.isEmpty(list)) {
            response.setState(HttpStatus.OK.value());
            response.setMessage("未找到数据");
            return response;
        }
        List<GoodsVo> goodsVos = ListUtils.copyList(list, GoodsVo.class);
        responseData.setCurrent(page.getCurrent());
        responseData.setSize(page.getSize());
        responseData.setTotal(page.getTotal());
        responseData.setList(goodsVos);
        response.setData(responseData);
        return response;
    }
}
