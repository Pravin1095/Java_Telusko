package com.telusko;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] a){
Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
Laptop l1 = new Laptop();
Laptop l2 = new Laptop();
s1.setSage(18);
s1.setsName("Praggnanandha");
s1.setRollNo(4);
s1.setRating(2720);

        s2.setSage(31);
        s2.setsName("Magnus");
        s2.setRollNo(1);
        s2.setRating(2886);

        s3.setSage(31);
        s3.setsName("Hikaru");
        s3.setRollNo(2);
        s3.setRating(2820);


l1.setLaptopId(1);
l1.setRam(32);
l1.setBrand("Acer");
l1.setModel("Predator");

        l2.setLaptopId(2);
        l2.setRam(32);
        l2.setBrand("Lenovo");
        l2.setModel("ThinkPad");

s1.setLaptops(Arrays.asList(l1, l2));
l1.setStudents(Arrays.asList(s1,s2));
l2.setStudents(Arrays.asList(s1,s3));

// Configuration is a class and we need to create object of this to use
//it to connect to hibernate Session
//Configuration cfg = new Configuration();
//cfg.addAnnotatedClass(com.telusko.Student.class);  // Need to mention the class in which we map with our database
//cfg.configure();
//The above lines are replaced with the below ones

        SessionFactory sf = new Configuration().addAnnotatedClass(com.telusko.Student.class).addAnnotatedClass(com.telusko.Laptop.class).configure().buildSessionFactory(); //SessionFactory object is returned by buildSessionFactory method
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s1); //Persist helps to save the data in our database
        session.persist(l1);
        session.persist(l2);
//        session.merge(s1);  //This helps to update our database for an existing data. Also it is important to commit it.
            //Also if there isn't any data to update merge creates a data if that is not existing


        //Fetching data

//        Student s2 = null;
//        s2 = session.find(Student.class, 3);



        //Removing a data

//            Student s3 = null;
//            s3 = session.find(Student.class,14);
//            session.remove(s3);

            transaction.commit(); //We not only must save but must commit it for the data
            //to be stored in our database
            System.out.println(s2.getsName());

            session.close();
            sf.close();  //It is always good to close the session at the end
    }
}
