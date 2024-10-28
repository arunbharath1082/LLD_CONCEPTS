package Threads;

public class Adder implements Runnable{

    private Count count;

    public Adder(Count count){
        this.count=count;
    }


    @Override
    public synchronized void run() {
        for (int i=1;i<1000;i++){ /// unsynchronized

                count.incValue(i);

        }
    }
}
