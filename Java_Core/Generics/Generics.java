package Java_Core.Generics;


import java.util.ArrayList;

public class Generics {
    public static void main(String[] args){
//        Box<Integer> container = new Box<Integer>();
//        container.setContainer(123);
//        System.out.println(container.getContainer());
//
//        Box<String> containerString = new Box<String>();
//        containerString.setContainer("Get Container");
//        System.out.println(containerString.getContainer());

       StudentClass<ArrayList<String>> student = new StudentClass<>();
       student.getQuery("Ram Raj Vimal Arun", "1,r");
        student.getQuery("Ram Raj Vimal Arun", "2,A- B+ O+ B+,B+");
        student.getQuery("90 60 93 89", "3, 90");
        student.getQuery("90 60 93 89", "4");
        student.getQuery("9 6 9.3 8.9", "5");

    }
}
