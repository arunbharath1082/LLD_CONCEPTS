package Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count=new Count();

        Adder adder=new Adder(count);
        Subtractor subtractor=new Subtractor(count);

        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtractor);

        t1.start();
        t2.start();
        t1.join();
       t2.join(); ///join is used to wait the main thread to complete the t1,t2 threads

        System.out.println(count.getValue());
    }
}
