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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        obj.code();
    }
}
