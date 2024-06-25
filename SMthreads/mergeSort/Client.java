
package mergeSort;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = Arrays.asList(2, 77, 9, 13, 4, 7, 11, 5);

        ExecutorService es = Executors.newFixedThreadPool(8);
        mergeSorter ms = new mergeSorter(list, es);

        Future<List<Integer>> fs = es.submit(ms);
        System.out.println(fs.get());

        es.shutdown();

    }
}