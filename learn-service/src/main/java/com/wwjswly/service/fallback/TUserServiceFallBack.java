package com.wwjswly.service.fallback;


import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.api.request.TuserRequest;
import com.wwjswly.learn.api.response.TUserResponse;
import com.wwjswly.learn.service.TUserServiceClient;

public class TUserServiceFallBack implements TUserServiceClient {
    @Override
    public ResponseEntity<TUserResponse> list(TuserRequest userRequest) {
        return null;
    }
}
