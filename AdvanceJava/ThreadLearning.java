package AdvanceJava;


//Here we have two classes and we want both to execute parallely. We extend the classes with
//thread class and in main we call rhe method start from Thread class. This method creates
//thread for the classes and parallel execution happens. It is important to declare run method
//inside the class so that the thread creation happens and the classes execute parallely.
class Hi extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");

            //sleep ensures that there is a difference of 10 milliseconds once this task is complete
            //With this we can now get output of Hello and Hi one after another
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Hello extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class ThreadLearning {
    public static void main(String[] a){
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        // This priority method ensures that the scheduler should prioritize the obj2 than obj1.
        //The number is between 1 to 10 where the max means this will be prioritize over other threads by the scheduler
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
    }
}
