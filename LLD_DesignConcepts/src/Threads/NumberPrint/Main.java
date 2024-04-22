package Threads.NumberPrint;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        NumberPrint obj1;
        System.out.println("Thread is"+ Thread.currentThread().getName());
//        for (int i=0;i<100;i++){
//            obj1=new NumberPrint(i);
//            Thread t1=new Thread(obj1);
//            t1.start();
//        }

        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for (int i=0;i<100;i++){
            obj1=new NumberPrint(i);
            executorService.submit(obj1);
        }

        System.out.println("Thread is"+ Thread.currentThread().getName());
    }
}
