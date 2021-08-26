package com.heshen.listener;

import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;

import org.springframework.stereotype.Component;

/**
 * @author heshen
 * @data 2021 - 08 - 26 - 23:42
 */

@RocketMQMessageListener(topic = "heshen-mq",consumerGroup = "${rocketmq.consumer.group}")
@Component
public class Consumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("接收到消息："+s);
    }
}
