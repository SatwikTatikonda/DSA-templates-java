package threads.HundredPrinter;

public class printNumber implements Runnable {
    public int number;

    public printNumber(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println(number + " got printed by " + Thread.currentThread().getName());
    }
}
