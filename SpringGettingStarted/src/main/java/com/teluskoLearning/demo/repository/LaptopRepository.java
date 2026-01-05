package com.teluskoLearning.demo.repository;

import com.teluskoLearning.demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap){
        System.out.println("Saved successfully to database");
    }
}
