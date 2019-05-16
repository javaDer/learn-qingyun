package com.wwjswly.learn.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwjswly.entity.goods.GoodsCategory;
import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.goods.GoodsCategoryRequest;
import com.wwjswly.learn.api.response.goods.GoodsCategoryResponse;
import com.wwjswly.learn.api.utils.ListUtils;
import com.wwjswly.learn.api.vo.goods.GoodsCategoryVo;
import com.wwjswly.learn.mapper.GoodsCategoryMapper;
import com.wwjswly.learn.service.GoodsCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 商品种类表 服务实现类
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
@Slf4j
@Service
public class GoodsCategoryServiceImpl extends ServiceImpl<GoodsCategoryMapper, GoodsCategory> implements GoodsCategoryService {


    @Override
    public ResponseEntity<GoodsCategoryResponse> queryList(GoodsCategoryRequest request) {
        ResponseEntity response = new ResponseEntity();
        response.setState(HttpStatus.OK.value());
        GoodsCategoryResponse responseData = new GoodsCategoryResponse();
        Long current = request.getCurrent()==0?1:request.getCurrent();
        Long size = request.getSize()==0?10:request.getSize();
        IPage<GoodsCategory> page = new Page<>(current,size);
        QueryWrapper<GoodsCategory> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(request.getId()!=0L,"category_id",request.getId());
        IPage<GoodsCategory> data = this.baseMapper.selectPage(page,queryWrapper);
        List<GoodsCategory> list = data.getRecords();
        if (CollectionUtils.isEmpty(list)){
            response.setState(HttpStatus.OK.value());
            response.setMessage("未找到数据");
            return response;
        }
        log.info(data.toString());
        List<GoodsCategoryVo> goodsCategoryVos = ListUtils.copyList(list,GoodsCategoryVo.class);
        responseData.setList(goodsCategoryVos);
        responseData.setCurrent(page.getCurrent());
        responseData.setSize(page.getSize());
        responseData.setTotal(page.getTotal());
        response.setData(responseData);
        return response;
    }
}
