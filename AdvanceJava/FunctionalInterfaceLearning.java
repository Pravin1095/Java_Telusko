package AdvanceJava;


//We can mention this annotation to let compiler know that it is a functional interface
//By mentioning functional interface annotation the compiler signals error when we declare more than one abstract methods
@FunctionalInterface
interface AF{   //Functional interface is a type of interface that has only one abstract method within it
    int show(int i, int j);
}
public class FunctionalInterfaceLearning {

    public static void main(String[] a) {
        //Lambda expression is used in Functional interface where we can just have ()->
        //followed by the logic inside our function. As we have show declared in interface
        // it automatically makes the logic to be for show method for the
        // object A inside show method
        AF obj = (int i, int j)->
        {
            System.out.println("Show "+i+" "+j);
            return i+j;
        };



//        {
//            public void show() {
//                System.out.println("Show");
//            }
//        };

        System.out.println(obj.show(4, 5));
    }
}
