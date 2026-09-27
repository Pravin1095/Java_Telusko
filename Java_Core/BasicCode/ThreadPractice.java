package Java_Core.BasicCode;

 class ThreadPractice {



    public static void main(String[] a){
        Hello he = new Hello();
        Hi h = new Hi();
        he.start();
        try{
            Thread.sleep(2);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        h.start();
    }
}
class Hello extends Thread{
    public void run(){
        int nums[] = new int[100];
        for(int n : nums){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Hi extends Thread{
    public void run(){
        int nums[] = new int[100];
        for(int n : nums){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

