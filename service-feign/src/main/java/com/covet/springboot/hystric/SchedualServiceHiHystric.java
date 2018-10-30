package com.covet.springboot.hystric;

import com.covet.springboot.feign.FeignServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/8/24.
 */
// 实现要加入熔断器的接口
@Component
public class SchedualServiceHiHystric implements FeignServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name  +" 该服务暂时不可用!";
    }
}
