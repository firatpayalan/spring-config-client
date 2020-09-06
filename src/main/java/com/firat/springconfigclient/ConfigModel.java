package com.firat.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
public class ConfigModel {

    @Value("${app.message}")
    private String applicationName;

    @Value("${app.refreshed.message}")
    private String refreshedMessage;

    public String getApplicationName() {
        return applicationName;
    }

    public String getRefreshedMessage() {
        return refreshedMessage;
    }
}
