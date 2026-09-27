package Java_Core.BasicCode;

public class FInterface {
    @FunctionalInterface
    interface FInter{
        void show(int i);
    }
    public static void main(String[] a){
//FInter f = new FInter(){
//    public void show(){
//        System.out.println("Showing check");
//    }
//};
        //With Functional Interface we can use Lambda expression which matches the above commented code
        FInter f = i-> System.out.println("Showing "+i);

f.show(5);
    }
}


