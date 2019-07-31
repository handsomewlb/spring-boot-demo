package com.wlb.springbootloggerresource.controller;

import com.wlb.springbootloggerresource.entity.ResourceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description: </p>
 *
 * @author wlb
 * @version 1.0
 * Company:Mopon
 * @name ResourceController
 * @date 2019/7/31 16:22
 */
@RestController
public class ResourceController {
    
    @Autowired
    private ResourceEntity resourceEntity;
    
    @RequestMapping("/resource")
    public ResourceEntity getResource() {
        return resourceEntity;
    }
}
