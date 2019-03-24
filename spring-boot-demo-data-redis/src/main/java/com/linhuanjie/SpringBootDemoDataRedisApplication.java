package com.linhuanjie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootApplication
public class SpringBootDemoDataRedisApplication {

    @Autowired
    private StringRedisTemplate template;

    public static void main(String[] args) {

        SpringApplication.run(SpringBootDemoDataRedisApplication.class, args);
    }

}
