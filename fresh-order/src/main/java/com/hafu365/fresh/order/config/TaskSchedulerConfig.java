package com.hafu365.fresh.order.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 定时任务配置类
 * Created by zhaihuilin on 2017/8/8  16:39.
 */
@Configuration
@ComponentScan({"com.hafu365.fresh.order.config","com.hafu365.fresh.order.task"})
@EnableScheduling
public class TaskSchedulerConfig {
}
