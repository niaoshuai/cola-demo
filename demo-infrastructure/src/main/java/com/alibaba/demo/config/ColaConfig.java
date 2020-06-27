package com.alibaba.demo.config;

import com.alibaba.cola.boot.Bootstrap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Configuration for COLA framework
 *
 * @author niaoshuai
 */
@Configuration
public class ColaConfig {

    @Bean(initMethod = "init")
    public Bootstrap bootstrap() {
        Bootstrap bootstrap = new Bootstrap();
        List<String> packagesToScan = new ArrayList<>();
        packagesToScan.add("com.alibaba.demo");
        bootstrap.setPackages(packagesToScan);
        return bootstrap;
    }
}