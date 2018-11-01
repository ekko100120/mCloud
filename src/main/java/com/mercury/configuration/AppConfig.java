package com.mercury.configuration;


import com.mercury.entity.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Company company(){
        return  new Company();
    }
}
