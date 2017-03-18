package com.jorgehernandezramirez.spring.springcloud.zuul.configuration;

import com.jorgehernandezramirez.spring.springcloud.zuul.filter.MyZuulFilter;
import com.netflix.zuul.ZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfiguration {

    public ZuulConfiguration(){
        //For Spring
    }

    @Bean
    public ZuulFilter buildZuulFilter(){
        return new MyZuulFilter();
    }
}
