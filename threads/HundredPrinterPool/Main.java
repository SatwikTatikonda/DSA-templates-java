package threads.HundredPrinterPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// import threads.HundredPrinter.printNumberPool;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i <= 100; i++) {

            printNumberPool pt = new printNumberPool(i);
            executorService.execute(pt);

        }
    }
}