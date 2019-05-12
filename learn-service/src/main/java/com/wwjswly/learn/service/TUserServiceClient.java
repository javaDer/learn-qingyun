package com.wwjswly.learn.service;

import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.TuserRequest;
import com.wwjswly.learn.api.request.UserSaveRequest;
import com.wwjswly.learn.api.response.TUserResponse;
import com.wwjswly.learn.service.fallback.TUserServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "learn-order", fallback = TUserServiceFallBack.class)
public interface TUserServiceClient  {
    @RequestMapping(value = "/order/list",method = RequestMethod.POST)
    ResponseEntity<TUserResponse> list(@RequestBody TuserRequest userRequest);
    @RequestMapping(value = "/order/save",method = RequestMethod.POST)
    ResponseEntity save(@RequestBody UserSaveRequest userRequest);

}
