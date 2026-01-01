package AdvanceJava;


enum Status{   // enum is used for declaring a class that contains named constants. Here all the constants inside Status are its objects
    Running, Failed, Pending, Success;
}

enum Laptop{
    MacBook(2000), Lenovo(3000), HP(4000), Surface, Acer(5000);

    private int price;
    private Laptop(){  //As we are creating object inside class itself we are using the private constructor
        this.price = 500;
    }
    private Laptop(int price){   //Constructor in enum
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}
public class Enum {
    public static void main(String a[]){
Status s = Status.Running;
Status s1[] = Status.values();  //Returns array of the Status values
System.out.println(s);
        System.out.println(s.ordinal());  //Returns the number it is defined inside Status

        for(Status i : s1) {
            System.out.println(i + ": " + s.ordinal());
        }
        switch(s){
            case Running:
                System.out.println("Working good");
                break;
            case Failed:
                System.out.println("Working good");
                break;
            case Pending:
                System.out.println("Status is pending");
                break;
            case Success:
                System.out.println("Successfully executed");
                break;
        }

     for(Laptop lap : Laptop.values()){
         System.out.println(lap+ " : "+lap.getPrice());
     }



    }
}
