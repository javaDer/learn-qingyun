package com.wwjswly.learn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwjswly.learn.entity.TUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangzhaofa
 * @since 2018-12-15
 */
public interface TUserService extends IService<TUser> {

    TUser getTuserById(Long id);
}
