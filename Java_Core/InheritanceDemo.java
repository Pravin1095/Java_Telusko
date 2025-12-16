package Java_Core;
import Java_Core.tools.VeryAdvCalc;



// IMPORTANT : Java does not support Multiple Inheritance. We cannot extend from two classes A and B. Only Multilevel
// Inheritance is possible



//this and super method

class A{


    public A(){
        super();
        System.out.println("A default constructor");
    }
    public A(int n){
        super();
        System.out.println("A parameterized consturctor");
    }


    public void show(){
        System.out.println("Show A method");
    }

    public void config(){
        System.out.println("Show A config");
    }
}

class B extends A{


    //Every constructor has this method super within it but we cannot see it. So whenever an object is created
    // this super gets called , this super calls the constructor of its parent class, in our case A and inside that
    //it will have a super and it calls its parent class. [Note : All Java class has a parent class Object that they will
    // be extending so A's super will call the super in Object class's constructor. If we want to call aparameterized constructor pass
    // a parameter in super method.


    public B(){
        super();
        System.out.println("B default constructor");
    }
    public B(int n){
//        super(n);
        this(); // this will call the constructor of its own class which is B() and inside that the super() will call the constructor of A class
        System.out.println("B parameterized consturctor");
    }


    public void show(){
        System.out.println("Show B method");
    }
}
public class InheritanceDemo {
    public static void main(String a[]){
        VeryAdvCalc c1 = new VeryAdvCalc();

        System.out.println(c1.add(2,3));
        System.out.println(c1.multiply(2,3));
        System.out.println(c1.power(2,3));

        B b1 = new B(5);  // What happens is when
         b1.show();   //We have show in both class but B method overrides A. First it checks B class and then goes to A
    }

}
