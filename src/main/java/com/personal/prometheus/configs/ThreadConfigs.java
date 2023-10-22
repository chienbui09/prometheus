package com.personal.prometheus.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class ThreadConfigs {

    @Bean
    public ExecutorService getThreadConfig(){

        return Executors.newFixedThreadPool(10);
    }
}
