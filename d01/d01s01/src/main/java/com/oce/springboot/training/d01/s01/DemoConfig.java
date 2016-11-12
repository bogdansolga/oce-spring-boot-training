package com.oce.springboot.training.d01.s01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Sample Spring configuration, which exposes two simple {@link Bean}s
 *
 * @author bogdan.solga
 */
@Configuration
public class DemoConfig {

    @Bean
    public String helloSpring() {
        return "Hello, Spring!";
    }

    @Bean
    public FirstSpringBean firstSpringBean() {
        return new FirstSpringBean();
    }
}