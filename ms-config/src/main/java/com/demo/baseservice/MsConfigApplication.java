package com.demo.baseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author zx
 * @date 2018/10/16 上午12:38
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class MsConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsConfigApplication.class, args);
    }
}
