package com.covet.springboot.controller;

import com.covet.springboot.feign.FeignServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/8/23.
 */
@RestController
public class FeignController {

    @Autowired
    private FeignServiceHi feignServiceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return feignServiceHi.sayHiFromClientOne(name);
    }
}
