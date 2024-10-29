package Threads.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Mergesorter implements Callable<List<Integer>> {

    List<Integer> listtoSort;
    ExecutorService executorService;
    Mergesorter(List<Integer> listtoSort,ExecutorService executorService){
        this.listtoSort=listtoSort;
        this.executorService=executorService;
    }


    @Override
    public List<Integer> call() throws Exception {

        int size=listtoSort.size();
        if (size <= 1) {
            return listtoSort;
        }

        List<Integer>leftHalf=new ArrayList<>();
        List<Integer>rightHalf=new ArrayList<>();

        for(int i=0;i<size/2;i++){
            leftHalf.add(listtoSort.get(i));
        }
           for(int i=size/2;i<size;i++){
            rightHalf.add(listtoSort.get(i));
        }

            Mergesorter lefthalf=new Mergesorter(leftHalf,executorService);
            Mergesorter righthalf=new Mergesorter(rightHalf,executorService);

            Future<List<Integer>> sortedlefthalf=executorService.submit(lefthalf);
            Future<List<Integer>> sortedrighthalf=executorService.submit(righthalf);

            List<Integer>sortedLeftHalf=sortedlefthalf.get();
            List<Integer>sortedRightHalf=sortedrighthalf.get();


            int i = 0;
             int j = 0;
        List<Integer> sortedList = new ArrayList<>();

        while (i < sortedLeftHalf.size() && j < sortedRightHalf.size()) {
            if (sortedLeftHalf.get(i) < sortedRightHalf.get(j)) {
                sortedList.add(sortedLeftHalf.get(i));
                i++;
            }
            else {
                sortedList.add(sortedRightHalf.get(j));
                j++;
            }
        }

        while (i < sortedLeftHalf.size()) {
            sortedList.add(sortedLeftHalf.get(i));
            i++;
        }

        while (j < sortedRightHalf.size()) {
            sortedList.add(sortedRightHalf.get(j));
            j++;
        }

        return sortedList;
    }
}
