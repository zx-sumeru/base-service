package com.demo.baseservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author zx
 * @date 2018/10/17 下午8:54
 */
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
@EnableCircuitBreaker
public class ZipkinServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZipkinServerApplication.class)
                .web(true)
                .run(args);
    }
}
