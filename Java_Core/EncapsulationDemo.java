package Java_Core;

//Encapsulation is one of OOPS concept where we have private instance variables that cannot be directly accessed
//by the object. To access them we need to create a getter method to get values and setter to set the values if we want to
class Human{
    private String name;
    private int age;

    //Constructor : Constructor is a special method . It has same name as the class name and it executes whenever
    //a class object is created.

    public Human(){ //Default Constructor (This constructor will always be there even if we don't provide it explicitly
        age = 13;
        name = "John";
    }

    public Human(String name, int age){ //Parameterized constructor
        this.name = name;
        this.age = age;
    }


    //This keyword : Let's say we are passing name of same instance variable name (here 'name') now we cannot set
    //as name = name as java gives priority of local variable name than the instance variable . To modify the instance
    //variable we need to use this keyword this.name = name
    public void setName(String name){
this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
public class EncapsulationDemo {

    public static void main(String a[]){

        new Human(); //Anonymous object , object with no reference created.
        new Human().setName("Anonymous");


        Human obj1 = new Human();
        Human obj2 = new Human("Navin", 34);
        obj1.setName("Pravin");
      obj1.setAge(25);
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
