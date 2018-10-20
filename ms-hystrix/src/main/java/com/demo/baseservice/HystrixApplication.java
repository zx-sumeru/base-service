package com.demo.baseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zx
 * @date 2018/10/16 下午9:19
 */
@SpringBootApplication
@EnableHystrixDashboard
@Controller
public class HystrixApplication {

    @RequestMapping("/")
    public String index() {
        return "forward:/hystrix";
    }

    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }

}
