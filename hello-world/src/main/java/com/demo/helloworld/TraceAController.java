package com.demo.helloworld;

import com.demo.helloworld.feign.TraceB;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zx
 * @date 2018/10/18 下午8:48
 */
@RestController
public class TraceAController {

    private static final Logger log = LoggerFactory.getLogger(TraceAController.class);

    private final RestTemplate restTemplate;

    private final TraceB traceB;

    @Autowired
    public TraceAController(RestTemplate restTemplate, TraceB traceB) {
        this.restTemplate = restTemplate;
        this.traceB = traceB;
    }


    @RequestMapping(value = "/trace-1", method = RequestMethod.GET)
    public String trace() {
        log.info("调用请求 /trace-1");
        return restTemplate.getForEntity("http://trace-2/traceB-2", String.class).getBody();
    }

    @RequestMapping(value = "/traceA-2", method = RequestMethod.GET)
    public String trace2() {
        log.info("调用请求 /traceA-2");
        return traceB.getTrace();
    }

}
