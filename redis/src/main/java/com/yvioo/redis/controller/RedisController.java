package com.yvioo.redis.controller;

import com.yvioo.redis.config.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @Autowired
    private RedisTemplate redisTemplate;



    @GetMapping(value = "/test")
    public void test(){
        redisService.set("key","value");
        redisTemplate.opsForValue().set("key","value");
    }
}
