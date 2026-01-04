package com.teluskoLearning;

import org.springframework.stereotype.Component;

public class Desktop implements Computer {
    @Override
    public void compile(){
        System.out.println("Compiling using Desktop");
    }
}
