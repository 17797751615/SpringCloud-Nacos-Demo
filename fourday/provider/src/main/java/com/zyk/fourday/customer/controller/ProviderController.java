package com.zyk.fourday.customer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyk
 * @description
 * @date 2020-01-06 15:14
 */
@RestController
public class ProviderController {
    @RequestMapping("/provider/{name}")
    public String testProvider (@PathVariable String name) {
        return "Hello Discovery 8093" +name;
    }
}
