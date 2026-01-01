package com.telusko;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] a){
Student s1 = new Student();
Laptop l1 = new Laptop();
s1.setSage(18);
s1.setsName("Praggnanandha");
s1.setRollNo(4);
s1.setRating(2720);
l1.setRam(32);
l1.setBrand("Acer");
l1.setModel("Predator");

s1.setLaptop(l1);

// Configuration is a class and we need to create object of this to use
//it to connect to hibernate Session
//Configuration cfg = new Configuration();
//cfg.addAnnotatedClass(com.telusko.Student.class);  // Need to mention the class in which we map with our database
//cfg.configure();
//The above lines are replaced with the below ones

        SessionFactory sf = new Configuration().addAnnotatedClass(com.telusko.Student.class).configure().buildSessionFactory(); //SessionFactory object is returned by buildSessionFactory method
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s1); //Persist helps to save the data in our database
//        session.merge(s1);  //This helps to update our database for an existing data. Also it is important to commit it.
            //Also if there isn't any data to update merge creates a data if that is not existing


        //Fetching data

        Student s2 = null;
        s2 = session.find(Student.class, 3);



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
