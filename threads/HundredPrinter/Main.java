package threads.HundredPrinter;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            printNumber pt = new printNumber(i);
            Thread t = new Thread(pt);
            t.start();
        }
    }
}