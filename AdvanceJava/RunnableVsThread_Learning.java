package AdvanceJava;


// If you check on Thread Class , it will be implementing the functional interface runnable
//that has the run method which we use in our Thread extended methods. Hence instead of extending
//Thread we can create Runnable objects and call run method using Lambda expression which works
//for functional interfaces.

//Then we create two objects of Thread and call the start method by passing the runnable object
//as params to those threads. With this we call start method and thread will be created for our
//runnable objects

class Counter{
    int count;

    //This synchronized method makes sure that only one thread of the two of them can call this
    //method at a time. Both cannot call this method at same tim

    //If both threads calls at same time we cannot expect the output of 20000.
    public synchronized void increment(){
        this.count+=1;
    }
}
public class RunnableVsThread_Learning {
    public static void main(String args[]) throws InterruptedException {

        Counter c =new Counter();
Runnable obj1 = ()->{
    for(int i=0;i<10000;i++){
        c.increment();
//        System.out.println("Hello");
//        try{
//            Thread.sleep(10);
//        }
//        catch(InterruptedException e){
//            e.printStackTrace();
//        }
}
    };

        Runnable obj2 = ()->{
            for(int i=0;i<10000;i++){
                c.increment();
//                System.out.println("Hi");
//                try{
//                    Thread.sleep(10);
//                }
//                catch(InterruptedException e){
//                    e.printStackTrace();
//                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // This method tells the main thread that only after both t1 and t2 completes execution
        //the main thread that displays the count value gets executed

        //If we do not use this method this main thread will be called even before the t1 and t2
        //gets completed so that the output can be like 100 , 200 , 233 , etc.. because main thread
        //has been executed
        t1.join();
        t2.join();

        System.out.println("Count "+c.count);
}
}
