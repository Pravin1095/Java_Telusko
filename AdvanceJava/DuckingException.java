package AdvanceJava;


class ADuck{
    //We are using throws so that we are not required to use try catch inside our show method
    //Instead we are instructing the method that is using our show method to handle it. This
    //is achieved using throws keyword
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}
public class DuckingException {
    public static void main(String[] a){
        ADuck obj = new ADuck();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Class is not found");
        }
    }
}
