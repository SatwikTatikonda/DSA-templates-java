package mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class mergeSorter implements Callable<List<Integer>> {

    List<Integer> list;
    ExecutorService es;

    public mergeSorter(List<Integer> list, ExecutorService es) {

        this.list = list;
        this.es = es;

    }

    @Override
    public List<Integer> call() throws Exception {

        if (list.size() <= 1) {
            return list;
        }

        List<Integer> firstHalf = new ArrayList<>();
        List<Integer> secondHalf = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() / 2) {
                firstHalf.add(list.get(i));
            } else {
                secondHalf.add(list.get(i));
            }
        }

        mergeSorter sortedLeft = new mergeSorter(firstHalf, es);
        mergeSorter sortedRight = new mergeSorter(secondHalf, es);

        // List<Integer> sortedLeftHalf = sortedLeft.call();
        // List<Integer> sortedRightHalf = sortedRight.call();

        Future<List<Integer>> promiseofFirstHalf=es.submit(sortedLeft);
        Future<List<Integer>> promiseofSecondHalf = es.submit(sortedRight);

        List<Integer>sortedLeftHalf=promiseofFirstHalf.get();
        List<Integer> sortedRightHalf = promiseofSecondHalf.get();
        
        List<Integer> sortedList = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < sortedLeftHalf.size() && j < sortedRightHalf.size()) {

            if (sortedLeftHalf.get(i) <= sortedRightHalf.get(j)) {

                sortedList.add(sortedLeftHalf.get(i));
                i += 1;
                k += 1;

            } else {

                sortedList.add(sortedRightHalf.get(j));
                j += 1;
                k += 1;

            }

        }

        while (i < sortedLeftHalf.size()) {
            sortedList.add(sortedLeftHalf.get(i));
            i += 1;
            k += 1;
        }

        while (j < sortedRightHalf.size()) {
            sortedList.add(sortedRightHalf.get(j));
            j += 1;
            k += 1;
        }

        return sortedList;

    }

}
