package com.itheima.controller;

import com.itheima.service.RestService;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "test")
@RequestMapping("/test")
public class RestConsumerController {

    @Autowired
    private RestService restService;

    @GetMapping("/test")
    public String sayRest(String name) {
        return restService.sayRest(name);
    }
}