package com.linhuanjie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoDataRedisApplicationTests {

    @Autowired
    private StringRedisTemplate template;


    @Test
    public void testStringWithRedis(){
        template.opsForValue().set("a","A");
        String result = template.opsForValue().get("a");
        System.out.println(result);
    }

    @Test
    public void contextLoads() {

    }

}
