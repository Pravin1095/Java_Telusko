package com.teluskoLearning.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    //@Autowired is used to get the object of class Laptop from Spring IOC container
    //In main we used Application context to get the Bean but here with just Autowired
    //we can wire between Alien and Laptop class and get the Bean of Laptop class

    @Value("21")
    private int age;

    @Autowired
            @Qualifier("laptop")
    Computer computer;

    public void code(){
        computer.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
