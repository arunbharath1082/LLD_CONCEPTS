package Threads;

public class Adder implements Runnable{

    private Count count;

    public Adder(Count count){
        this.count=count;
    }


    @Override
    public void run() {
        for (int i=0;i<100;i++){ /// unsynchronized
            synchronized (count) {
                count.incValue(i);
            }
        }
    }
}
