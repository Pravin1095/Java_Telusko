package Java_Core.Generics;

public class Box<T> {
    private T container;

    public T getContainer(){
     return this.container;
    }

    public void setContainer(T container){
        this.container = container;
    }
}
