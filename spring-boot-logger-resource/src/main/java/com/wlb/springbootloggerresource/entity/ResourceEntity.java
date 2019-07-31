package com.wlb.springbootloggerresource.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p>Description: </p>
 * 资源文件读取
 * @author wlb
 * @version 1.0
 * Company:Mopon
 * @name ResourceEntity
 * @date 2019/7/31 16:16
 */
@Component
public class ResourceEntity {
    
    @Value("${com.resource.resourceUrl}")
    private String resourceUrl;
    
    @Value("${com.resource.resourcePort}")
    private String resourcePort;
    
    @Value("${com.resource.maxNum}")
    private Integer maxNum;
    
    @Value("${com.resource.minNum}")
    private Integer minNum;

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getResourcePort() {
        return resourcePort;
    }

    public void setResourcePort(String resourcePort) {
        this.resourcePort = resourcePort;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public Integer getMinNum() {
        return minNum;
    }

    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }
}
