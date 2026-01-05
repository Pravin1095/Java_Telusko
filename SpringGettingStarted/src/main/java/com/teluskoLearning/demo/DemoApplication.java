package com.teluskoLearning.demo;

import com.teluskoLearning.demo.model.Alien;
import com.teluskoLearning.demo.model.Laptop;
import com.teluskoLearning.demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//Application Context is an interface that helps to create dependency injection
		//Dependency injection is a concept where spring itself creates, maintains and destroys
		//objects for us so that we can focus only on business logics.
		//The created beans will be stored in IOC(Inversion of control) container.
		//Spring will not create all the class objects. For it to create an object of a class
		//we need to mention @Component annotation on top of the class.
        //Hence if Bean doesn't exist it gives NoSuchBeanDefinitionException.

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Alien obj = context.getBean(Alien.class);
		obj.code();
		System.out.println(obj.getAge());

		Laptop lap = context.getBean(Laptop.class);
		LaptopService service = context.getBean(LaptopService.class);
		service.addLaptop(lap);
	}

}
