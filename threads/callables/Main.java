package threads.callables;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> val = List.of(1, 2, 3, 4, 5);
        ExecutorService executor = Executors.newCachedThreadPool();

        List<Future<Integer>> results = new ArrayList<>();
        for (Integer value : val) {
            SquareReturner sq = new SquareReturner(value);
            Future<Integer> ft = executor.submit(sq);
            results.add(ft);
        }

        for (Future<Integer> future : results) {

            System.out.println(future.isDone());

        }

        Thread.sleep(1000);

        for (Future<Integer> future : results) {
            System.out.println("square value is " + future.get());
        }

    }
}
