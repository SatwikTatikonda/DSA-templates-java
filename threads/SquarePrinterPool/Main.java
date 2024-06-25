package threads.SquarePrinterPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.*;
// import threads.HundredPrinter.printNumberPool;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);

        // Executor executor = Executors.newSingleThreadExecutor();
        // Executor executor = Executors.newFixedThreadPool(2);
        Executor executor = Executors.newCachedThreadPool();

        // for (int val : arr) { // auto boxing
        //     SqaurePool sp = new SqaurePool(val);
        //     executor.execute(sp);
        // }

        // samw thing using lambdas-----------
        for (int val : arr) {

            Runnable r = () -> System.out.println(val + " squared " + (val * val + " printed by " + Thread.currentThread().getName()));
            

            executor.execute(r);

        }
    }
}