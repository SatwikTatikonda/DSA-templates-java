package locks;

import java.util.concurrent.locks.*;

import java.util.concurrent.locks.Lock;

public class substractor implements Runnable {

    counter c2;
    Lock lock;

    substractor(counter c, Lock lock) {
        c2 = c;
        this.lock = lock;
    }

    public void run() {

        for (int i = 0; i < 100; i++) {
            lock.lock();
            c2.val -= 1;
            lock.unlock();
        }

    }
}
