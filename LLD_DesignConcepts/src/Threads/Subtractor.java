package Threads;

public class Subtractor implements Runnable {
    Count count;

    Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public synchronized void  run() {
        for (int i = 1; i <= 1000; i++) {

            count.incValue(-i);
        }
    }
}
