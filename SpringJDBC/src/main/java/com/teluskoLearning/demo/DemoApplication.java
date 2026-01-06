package com.teluskoLearning.demo;

import com.teluskoLearning.demo.models.Student;
import com.teluskoLearning.demo.repository.StudentRepo;
import com.teluskoLearning.demo.service.StudentService;
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

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);
		System.out.println(service.getStudents());
		System.out.println(s);
	}

}
