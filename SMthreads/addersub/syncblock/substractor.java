package syncblock;

import java.util.HashMap;

public class substractor implements Runnable {

    counter c2;

    substractor(counter c) {
        c2 = c;
    }

    public void run() {

        for (int i = 0; i < 100; i++) {
            synchronized (c2) {

                c2.val -= 1;
            }

        }

    }
}
