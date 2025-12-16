package Java_Core;


class Mobile{
    String brand;
    int price;
    static String name;   //We use static variables so that this name will be same for every object that we create for Mobile class
    // Hence while accessing static variables through objects we use className with it (Mobile.name)

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("Constructor executed");
    }

    static{   //Static block : We use static block to name our static variable and this block will be called only once whenever the class Loads.
              // Ususally the class Loads whenever we create an object or if we don't want object to be created but our class
              // to be loaded we need to use 'Class' class in Java Class.forName(className)
        name = "Mobile";
        System.out.println("static executed");
    }
    public void show(){
        System.out.println(brand+ " : "+price+" : "+name);
    }

    public static void show1(Mobile obj){    //Static methods is same concept as variables. We can only use static varibables inside a static method
        // because each object's instance variables will be different . Hence to access instance variables we need to
        //pass the obj as parameter to static method and access instance variable through that.
        System.out.println(obj.brand+ " : "+obj.price+" : "+name);
    }
}
public class StaticVariablesAndMethods {


    public static void main(String a[]) throws ClassNotFoundException {

//        Class.forName("Mobile");
          Mobile obj1  = new Mobile();
          obj1.brand = "Apple";
          obj1.price = 1700;
          Mobile.name = "smartphone";

        Mobile obj2  = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1500;
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);

    }
}
