package com.bsea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/info")
    public String getInfo() {
        return this.restTemplate.getForEntity("http://SERVER-PROVIDER/info", String.class).getBody();
    }
}
