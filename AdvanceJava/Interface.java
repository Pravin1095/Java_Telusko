package AdvanceJava;


// interface are by default abstract class and the methods inside them are abstract
//Hence if you are implementing class from it , it is mandatory to define the methods within that are declared in the interface
interface IA{
    int age = 44;
    String area ="Mumbai";  //Variables created here are final and static (Couldn't modify them)
    public void show();
    public void config();


}

interface X{
    public void run();
}

interface Y extends X{  //One interface can extend another interface and all methods of parent interface are inherited to this

}

class B implements IA,Y{  //Multiple Inheritance is possible with interfaces
    public void show(){
        System.out.println("show");
    }

    public void config(){
        System.out.println("config");
    }

    public void run(){
        System.out.println("run");
    }

}
public class Interface {
public static void main(String a[]){
    IA obj;
    obj = new B();
    obj.show();
    obj.config();
    System.out.println(IA.area);
}

}
