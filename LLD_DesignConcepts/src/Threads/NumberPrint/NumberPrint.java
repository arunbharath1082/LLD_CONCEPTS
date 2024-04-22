package Threads.NumberPrint;

public class NumberPrint implements Runnable{

    private int num;

    public NumberPrint(int num) {
        this.num = num;
    }


    @Override
    public void run() {
        System.out.println("number is "+ num +Thread.currentThread().getName());

    }
}
