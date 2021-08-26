package com.heshen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringbootMqConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMqConsumerApplication.class, args);
        log.info("消费者启动成功");
    }

}
