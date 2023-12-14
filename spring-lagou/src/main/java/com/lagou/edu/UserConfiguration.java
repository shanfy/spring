package com.lagou.edu;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    @Bean
    public InnerUser innerUser(){
        return new InnerUser();
    }


    public class InnerUser{

    }
}
