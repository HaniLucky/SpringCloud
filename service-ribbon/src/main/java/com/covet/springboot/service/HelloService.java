package com.covet.springboot.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018/8/22.
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    // 对该接口添加断路器功能  指定如果要访问的SERVICE-HI接口如果失败 则调用hiError方法  返回一个字符串说明  不会阻断主流程
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        // 使用Get方法访问服务 通过服务名来访问服务
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String hiError(String name){
        return  "hi "+name + " sorry,error. service stop!!";
    }
}
