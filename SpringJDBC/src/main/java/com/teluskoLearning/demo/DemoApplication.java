package com.teluskoLearning.demo;

import com.teluskoLearning.demo.models.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Student s = context.getBean(Student.class);

		s.setRollNo(1);
		s.setName("Magnus");
		s.setMarks(100);
		System.out.println(s);
	}

}
