package com.wwjswly.learnwebflux.controller;

import com.wwjswly.webflux.ProxyIpEntity;
import com.wwjswly.webflux.vo.ProxyIpVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ReactiveHashOperations;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author zhaofa
 * @title: ProxyIpWebFluxController
 * @date 2019-10-16 10:28
 */
@RestController
@Slf4j
public class ProxyIpWebFluxController {
    /**
     * 注入响应式的ReactiveRedisTemplate
     */
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private ReactiveRedisTemplate reactiveRedisTemplate;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Mono<ProxyIpVo> findCityById(@PathVariable("id") Long id) {
        String key = "useful_proxy";
        ProxyIpVo vo = new ProxyIpVo();
        List<Map<String, Object>> list = new ArrayList<>();
        HashOperations hashOperations = redisTemplate.opsForHash();
        Set<String> hashKeys = hashOperations.keys(key);
        ProxyIpEntity proxyIpEntity = new ProxyIpEntity();
        for (String str : hashKeys) {
            Map<String, Object> map = (Map<String, Object>) hashOperations.get(key, str);
            list.add(map);
        }
        vo.setData(list);
        log.info("keys:{}", hashKeys);
        return Mono.create(monoSink -> monoSink.success(vo));
    }

    @GetMapping("/test")
    public Mono<String> hello() {
        return Mono.just("Welcome to reactive world ~");
    }
}
