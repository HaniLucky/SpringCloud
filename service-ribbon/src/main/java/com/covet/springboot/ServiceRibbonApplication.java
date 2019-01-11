package com.covet.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// @EnableDiscoveryClient向服务中心注册
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix  // 开启断路器功能  hystix
@EnableHystrixDashboard   // 添加熔断器仪表盘
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication.class, args);
    }

    @Bean
    // 通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
    @LoadBalanced
    // 向程序的ioc注入一个bean: restTemplate
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
