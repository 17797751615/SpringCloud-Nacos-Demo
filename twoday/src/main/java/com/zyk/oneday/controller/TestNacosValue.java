package com.zyk.oneday.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyk
 * @description
 * @date 2019-12-25 10:58
 */
@RestController
@RequestMapping("config")
public class TestNacosValue {

    @NacosValue(value = "${useLocalCache:deafult}", autoRefreshed = true)
    private String useLocalCache;

    @GetMapping("/get")
    public String get() {
        return useLocalCache;
    }
}