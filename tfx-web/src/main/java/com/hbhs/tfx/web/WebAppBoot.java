package com.hbhs.tfx.web;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author: juqi
 * @Date: 2018/1/24
 **/
@SpringBootApplication(exclude = {MongoAutoConfiguration.class, RedisAutoConfiguration.class, RedisRepositoriesAutoConfiguration.class, SessionAutoConfiguration.class})
@EnableAspectJAutoProxy
@EnableAsync
@ComponentScan(value = {
        "com.hbhs.tfx.web"
})
@MapperScan(value = {
        "com.hbhs.tfx.web.dao.impl.mapper"
})
public class WebAppBoot {
    private static final Logger LOG = LoggerFactory.getLogger(WebAppBoot.class);

    public static void main(String[] args){
        SpringApplication.run(WebAppBoot.class, args);
    }
}
