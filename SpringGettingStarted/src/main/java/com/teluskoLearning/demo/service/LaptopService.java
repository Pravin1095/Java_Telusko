package com.teluskoLearning.demo.service;

import com.teluskoLearning.demo.model.Laptop;
import org.springframework.stereotype.Service;

//Service is an annotation coming from Component. Hence it is better to write
//@Service for service files
@Service
public class LaptopService {
    public void addLaptop(Laptop lap){
        System.out.println("Method called");
    }
    public boolean isGoodForProg(Laptop lap){
        return true;
    }

}
