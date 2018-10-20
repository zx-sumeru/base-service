package com.demo.helloworld2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zx
 * @date 2018/10/18 下午8:55
 */
@RestController
public class TraceBController {
    private static final Logger logger = LoggerFactory.getLogger(TraceBController.class);

    @RequestMapping("/traceB-2")
    public String traceB2(HttpServletRequest request) {
        logger.info("调用请求 /traceB-2");
        logger.warn("请求 /traceB-2 TraceId:{}, SpanId:{}",
                request.getHeader("X-B3-TraceId"),
                request.getHeader("X-B3-SpanId"));
        return "I`m traceB-2";
    }
}
