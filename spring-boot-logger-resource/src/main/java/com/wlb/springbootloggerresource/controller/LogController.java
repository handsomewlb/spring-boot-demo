package com.wlb.springbootloggerresource.controller;

import com.wlb.springbootloggerresource.config.LogConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description: </p>
 * 测试日志效果
 * @author wlb
 * @version 1.0
 * Company:Mopon
 * @name LogController
 * @date 2019/7/31 15:03
 */
@RestController
public class LogController extends LogConfig {
    
    @RequestMapping("/log")
    public String showLog() {
        logger.debug("debug:Process in LogController.showLog method");
        logger.info("info:Process in LogController.showLog method");
        logger.warn("warn:Process in LogController.showLog method");
        logger.error("error:Process in LogController.showLog method");
        return "springboot log";
    }
}
