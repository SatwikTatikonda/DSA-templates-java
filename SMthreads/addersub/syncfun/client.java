package syncfun;

public class client {

    public static void main(String[] args) throws InterruptedException {

        counter c = new counter(1000);
        adder a = new adder(c);
        Thread t1 = new Thread(a);
        t1.start();
        substractor s = new substractor(c);
        Thread t2 = new Thread(s);
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.getVal());

    }

}
