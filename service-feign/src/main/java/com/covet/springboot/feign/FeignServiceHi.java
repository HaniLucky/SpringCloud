package com.covet.springboot.feign;

import com.covet.springboot.hystric.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/8/23.
 * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务。比如在代码中调用了service-hi服务的“/hi”接口
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface FeignServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
