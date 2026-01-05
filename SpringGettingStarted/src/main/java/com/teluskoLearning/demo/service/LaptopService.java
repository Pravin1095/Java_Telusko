package com.teluskoLearning.demo.service;

import com.teluskoLearning.demo.model.Laptop;
import com.teluskoLearning.demo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Service is an annotation coming from Component. Hence it is better to write
//@Service for service files
@Service
public class LaptopService {

    @Autowired
    LaptopRepository repository;

    public void addLaptop(Laptop lap){
        System.out.println("Method called");
        repository.save(lap);
    }
    public boolean isGoodForProg(Laptop lap){
        return true;
    }

}
