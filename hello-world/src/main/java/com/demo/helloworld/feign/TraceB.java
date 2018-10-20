package com.demo.helloworld.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zx
 * @date 2018/10/18 下午8:46
 */
@FeignClient(value = "trace-2")
public interface TraceB {

    @RequestMapping(value = "/traceB-2", method = RequestMethod.GET)
    String getTrace();


}
