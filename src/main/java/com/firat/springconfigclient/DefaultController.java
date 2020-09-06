package com.firat.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @Value("${app.message}")
    private String applicationName;

    @GetMapping("/")
    public String home() {
        return "Application name: "+ applicationName;
    }

}
