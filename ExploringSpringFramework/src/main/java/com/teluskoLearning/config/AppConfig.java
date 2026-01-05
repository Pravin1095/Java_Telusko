package com.teluskoLearning.config;

import com.teluskoLearning.Alien;
import com.teluskoLearning.Computer;
import com.teluskoLearning.Desktop;
import com.teluskoLearning.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;


//This is the configuration file and we need to add @Configuration on top of
//this class. To create a bean add @Bean config and return object of Desktop
//Spring comes to this file and creates and maintains object for us.

//Bean name:
//Spring in default assignes bean name to the method name that we are creating.
//If we want name to be assigned we can do that using name property
//We can either give one name or multiple name to our bean

//Scope: We can make a bean singleton or prototype using Scope annotation

//Autowire: Now let's wire the connection between Alien and Computer class
//Similar to XML we set the properties value in this file and we have Computer
//as param in Alien class, so with this, Spring will autowire the available
//Computer object in this file and maps it to the Computer.

//Now if we have two objects of Computer object spring will throw error.To fix
//this we need to use either @Qualifier or set a bean to Primary using @Primary

@Configuration
public class AppConfig {

    @Bean
//    public Alien alien(@Qualifier("desk1") Computer com){
        public Alien alien(Computer com){
        Alien obj = new Alien();
        obj.setAge(21);
        obj.setComputer(com);
        return obj;
    }
//    @Bean(name="desk1")
    @Bean(name={"Beast", "com2", "desk1"})
    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }
}
