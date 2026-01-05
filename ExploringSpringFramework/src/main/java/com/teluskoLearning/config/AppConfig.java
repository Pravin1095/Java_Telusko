package com.teluskoLearning.config;

import com.teluskoLearning.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//This is the configuration file and we need to add @Configuration on top of
//this class. To create a bean add @Bean config and return object of Desktop
//Spring comes to this file and creates and maintains object for us.

//Bean name:
//Spring in default assignes bean name to the method name that we are creating.
//If we want name to be assigned we can do that using name property
//We can either give one name or multiple name to our bean

@Configuration
public class AppConfig {

//    @Bean(name="desk1")
    @Bean(name={"Beast", "com2", "desk1"})
    public Desktop desktop(){
        return new Desktop();
    }
}
