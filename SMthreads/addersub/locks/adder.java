package locks;

import java.util.concurrent.locks.*;

public class adder implements Runnable {

    counter c1;
    Lock lock;

    adder(counter c, Lock lock) {
        c1 = c;
        this.lock = lock;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            lock.lock();
            c1.val += 1;
            lock.unlock();
        }
    }

}
