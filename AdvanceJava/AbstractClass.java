package AdvanceJava;
//Abstract class are defined so that when we have no idea what to define in one method
//but if we want that method to be there mandatorily in our child class we use abstract class
//We may or may not have abstract method inside abstract class
abstract class Car {
    public abstract void drive();  //Here we have drive as abstract method , just declaring in Car and defining it in Wagnor class
    public abstract void fly();
    public void playMusic(){
        System.out.println("Playing music...");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}

class UpdatedWagnorR extends WagonR{   //This type of class that uses abstract methods we call "Concrete class"
    public void fly(){
        System.out.println("Flying car");
    }
}
public class AbstractClass {

    public static void main(String a[]){
        Car obj = new UpdatedWagnorR(); // We cannot create object for abstract class
        obj.drive();
    }
}
