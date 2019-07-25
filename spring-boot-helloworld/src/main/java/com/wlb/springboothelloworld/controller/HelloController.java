package com.wlb.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description: </p>
 *
 * @author wlb
 * @version 1.0
 * Company:Mopon
 * @name HelloController
 * @date 2019/7/25 17:38
 */
@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String Hello() {
        return "Hello SpringBoot";
    }
}
