package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        String str = (String) redisTemplate.opsForValue().get("myKey");
        redisTemplate.opsForValue().set("myKey2","hahaha3");
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        redisTemplate.opsForSet().add("mySet",set.toString());
        System.out.println(str);
    }

}
