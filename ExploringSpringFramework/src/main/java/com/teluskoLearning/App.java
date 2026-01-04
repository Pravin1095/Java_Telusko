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
        Alien obj1 = (Alien) context.getBean("alien"); // The name here should match the id that we give in the xml file
        obj1.age = 21;
        obj1.code();
        System.out.println(obj1.age);

        Alien obj2 = (Alien) context.getBean("alien");
        obj2.code();
        System.out.println(obj2.age);
    }
}
