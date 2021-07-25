package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.pojo")
@Import(com.config.MyConfig.class)
public class MyConfig2 {
}
