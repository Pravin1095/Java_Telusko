package com.teluskoLearning;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    @Override
    public void compile(){
        System.out.println("Compiling using Laptop");
    }
}
