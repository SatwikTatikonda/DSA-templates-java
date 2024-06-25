package threads.SquarePrinterPool;

public class SqaurePool implements Runnable {
    public int number;

    public SqaurePool(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println(
                number + " squared " + (this.number * this.number + " printed by " + Thread.currentThread().getName()));
    }

}
