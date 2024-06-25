package locks;

import java.util.concurrent.locks.*;

public class client {

    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();
        counter c = new counter();
        c.val = 100000;
        adder a = new adder(c, lock);
        Thread t1 = new Thread(a);
        t1.start();
        substractor s = new substractor(c, lock);
        Thread t2 = new Thread(s);
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.val);

    }

}
