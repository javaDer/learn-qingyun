package com.wwjswly.learn.service;

import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.service.fallback.CloudMusicServiceFallBack;
import com.wwjswly.neteasecloudmusic.request.LoginEmailRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "leran-music-service", fallback = CloudMusicServiceFallBack.class)
public interface CloudMusicServiceClient {
    @PostMapping("/login")
    ResponseEntity loginByEmail(@RequestBody LoginEmailRequest request);
    @GetMapping("/search/{keywords}")
    ResponseEntity search(@PathVariable("keyworld") String keyworld);
}
