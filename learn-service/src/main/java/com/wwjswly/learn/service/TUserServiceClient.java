package com.wwjswly.learn.service;

import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.TuserRequest;
import com.wwjswly.learn.api.response.TUserResponse;
import com.wwjswly.learn.service.fallback.TUserServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "learn-send", fallback = TUserServiceFallBack.class)
public interface TUserServiceClient  {
    @RequestMapping(value = "/user/list",method = RequestMethod.POST)
    ResponseEntity<TUserResponse> list(@RequestBody TuserRequest userRequest);

}
