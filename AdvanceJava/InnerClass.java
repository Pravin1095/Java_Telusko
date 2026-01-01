package AdvanceJava;


class A{
    public void show(){

    }

    static class B{
        public void config(){

        }
    }


}

abstract class Anony{
    public abstract void show();
//    {
//        System.out.println("Inside Anony");
//    }
}
public class InnerClass {

    public static void main(String a[]){
        A obj = new A();
        obj.show();

//        A.B obj1 = obj.new B();  //To access the inner class B we need to first have object of A to create object of B
        A.B obj1 = new A.B();//If you wish to call B with object of A, declare B as static

   //Anonymous Inner class
   Anony ano = new Anony() //Now technically Anony is object of anonymous inner class and not of the real Anony class
   {    //Anonymous inner class
       public void show(){
    System.out.print("Inner Anonymous classs");
}
        };
   ano.show();

    }
}
