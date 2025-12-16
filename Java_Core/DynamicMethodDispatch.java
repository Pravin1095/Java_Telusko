package Java_Core;
class APoly{   //Final Class : If we want this class not to be inherited by anyone we can use final before class so no one can inherit yours

    final int CONSTANT = 1;  // if we want a variable to be constant we can use final
    public void show(){
        System.out.println("show A class");
    }

    final public void onlyShow(){   //This method cannot be oveerrid by any of the child class as it has final keyword
        System.out.println("This onlyshow cannot be inherited by any of the child class");
    }
}


class BPoly extends APoly{
    public void show(){
        System.out.println("show B class");
    }

//    public void onlyShow(){
//
//    }
}
class CPoly extends APoly{
    public void show(){
        System.out.println("show A class");
    }
}
class DPoly{
    public void show(){
        System.out.println("show A class");
    }
}
public class DynamicMethodDispatch {


    public static void main(String a[]){


APoly obj1 = new BPoly();    // We can have reference of super class and object of subclass. We cannot do like this for DPoly as it is not subclass of A
obj1.show();  // As B's object is called show in A is overridden by B

        obj1 = new APoly();
        obj1.show(); //Now B is overridden by A

        // Upcasting

        APoly obj2 = (APoly) new BPoly();  //upcasting to upper class so we now can now access all methods of A

        obj2.onlyShow();

        BPoly obj3 = (BPoly) obj2;  //downcasting
        obj3.show();
    }
}
