package Threads.callable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();
        Mergesorter mergesorter=new Mergesorter(List.of(3,4,1,5,6,23,8),executorService);

        Future<List<Integer>> sortedList=executorService.submit(mergesorter);
        List<Integer>sorted=sortedList.get();

        System.out.println(sorted.toString());

        executorService.shutdown();

    }
}
