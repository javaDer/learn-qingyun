package com.wwjswly.learn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.TuserRequest;
import com.wwjswly.learn.api.response.TUserResponse;
import com.wwjswly.learn.api.utils.ListUtils;
import com.wwjswly.learn.api.vo.TUserVo;
import com.wwjswly.learn.entity.TUser;
import com.wwjswly.learn.mapper.TUserMapper;
import com.wwjswly.learn.service.TUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhangzhaofa
 * @since 2018-12-15
 */
@Slf4j
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

    @Override
    public ResponseEntity<TUserResponse> queryList(TuserRequest userRequest) {
        IPage<TUser> page = new Page(userRequest.getCurrent(), userRequest.getSize());
        ResponseEntity response = new ResponseEntity();
        TUserResponse TuserResp = new TUserResponse();
        response.setState(HttpStatus.OK.value());
        QueryWrapper<TUser> queryWrapper = new QueryWrapper<>();
        IPage<TUser> page1 = this.baseMapper.selectPage(page, queryWrapper);
        List<TUser> list = page1.getRecords();
        log.info(page.toString());
        List<TUserVo> tUserVos = ListUtils.copyList(list, TUserVo.class);
        long count = tUserVos.stream().filter((TUserVo -> TUserVo.getUserEmail().equals("fa20091004@163.com"))).count();
        log.info(count + "");
        TuserResp.setList(tUserVos);
        TuserResp.setCurrent(page1.getCurrent());
        TuserResp.setSize(page1.getSize());
        TuserResp.setTotal(page1.getTotal());
        response.setData(TuserResp);
        return response;
    }
}
