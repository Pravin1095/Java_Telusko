package com.teluskoLearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //We need to say to spring to create object of class Alien.
        //There are several ways for this , we can use Java configuration,XML or annotations.
        //Here we use annotations to inform spring to create objects for our classes
        //Whenever we call ClassPathXMLAllpicationContext, passing our xml file, a bean
        //will be created for it
        //Note: if we have defined alien class twice in xml bean will be created twice.
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = context.getBean("alien", Alien.class); // The name here should match the id that we give in the xml file
        obj1.code();
        System.out.println(obj1.getAge());

//        Computer com = context.getBean(Computer.class);
//        Desktop desk = context.getBean(Desktop.class);

    }
}
