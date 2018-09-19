package com.orgdown.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demos")
public class DemoApiController {

    @GetMapping
    public String getDemo() {
        return "hello demo";
    }
}
