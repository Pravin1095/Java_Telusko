package com.teluskoLearning;

import com.teluskoLearning.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     //Java Based Configuration

ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
Desktop dt = context.getBean("desktop",Desktop.class);
dt.compile();

Alien a = context.getBean("alien", Alien.class);
        a.code();

//Desktop dt1 = context.getBean("Beast",Desktop.class);
//dt1.compile();



//        XML Configuration:
        //We need to say to spring to create object of class Alien.
        //There are several ways for this , we can use Java configuration,XML or annotations.
        //Here we use annotations to inform spring to create objects for our classes
        //Whenever we call ClassPathXMLAllpicationContext, passing our xml file, a bean
        //will be created for it
        //Note: if we have defined alien class twice in xml bean will be created twice.
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1 = context.getBean("alien", Alien.class); // The name here should match the id that we give in the xml file
//        obj1.code();
//        System.out.println(obj1.getAge());

//        Computer com = context.getBean(Computer.class);
//        Desktop desk = context.getBean(Desktop.class);

    }
}
