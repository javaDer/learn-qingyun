package com.wwjswly.learn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwjswly.learn.entity.TUser;
import com.wwjswly.learn.mapper.TUserMapper;
import com.wwjswly.learn.service.TUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhangzhaofa
 * @since 2018-12-15
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

    @Override
    public TUser getTuserById(Long id) {

        return this.baseMapper.selectById(id);
    }
}
