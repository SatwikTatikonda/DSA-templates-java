package syncblock;

public class adder implements Runnable {

    counter c1;

    adder(counter c) {
        c1 = c;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            synchronized (c1) {
                c1.val += 1;
            }

        }
    }

}
