package Java_Core;

public class WrapperClass {
    public static void main(String a[]){
        int num = 7;
        Integer num1 =num;  //This concept is called "boxing" where we are moving the primitive int variable inside an object with inbuilt Integer class
        int num2 = num1;  //auto-unboxing (getting integer variable from the object class)


        //Converting string to int using Integer class
        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*5);
    }
}
