package Java_Core.BasicCode;

public class Animal {
    public void sound(){
        System.out.println("Animal makes sound");
    }
}

 class Dog extends Animal{
     public void sound(){
         System.out.println("Dog makes sound");
     }

     public void eat(){
         System.out.println("Dog eats");
     }
}
