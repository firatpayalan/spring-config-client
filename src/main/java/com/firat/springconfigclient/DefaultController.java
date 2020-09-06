package com.firat.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DefaultController {

    private final ConfigModel configModel;

    public DefaultController(ConfigModel configModel) {
        this.configModel = configModel;
    }

    @GetMapping("/")
    public String home() {
        return "Application name: "+ configModel.getApplicationName();
    }

    @GetMapping("/refreshed")
    public String refresh() {
        return "Refreshed data: "+ configModel.getRefreshedMessage();
    }



}
