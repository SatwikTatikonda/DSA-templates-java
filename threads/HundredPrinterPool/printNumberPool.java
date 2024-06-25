package threads.HundredPrinterPool;

public class printNumberPool implements Runnable {
    public int number;

    public printNumberPool(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println(number + " got printed by " + Thread.currentThread().getName());
    }
}
