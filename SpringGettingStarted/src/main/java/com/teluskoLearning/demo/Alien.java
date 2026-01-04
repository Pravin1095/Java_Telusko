package com.teluskoLearning.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    //@Autowired is used to get the object of class Laptop from Spring IOC container
    //In main we used Application context to get the Bean but here with just Autowired
    //we can wire between Alien and Laptop class and get the Bean of Laptop class
    @Autowired
    Laptop laptop;

    public void code(){
        laptop.compile();
    }
}
