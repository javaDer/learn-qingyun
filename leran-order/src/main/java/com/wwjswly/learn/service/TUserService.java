package com.wwjswly.learn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwjswly.entity.TUser;
import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.TuserRequest;
import com.wwjswly.learn.api.response.TUserResponse;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhangzhaofa
 * @since 2018-12-15
 */
public interface TUserService extends IService<TUser> {

    ResponseEntity<TUserResponse> queryList(TuserRequest userRequest);
}
