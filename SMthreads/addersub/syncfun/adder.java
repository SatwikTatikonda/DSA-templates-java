package syncfun;

public class adder implements Runnable {

    counter c1;

    adder(counter c) {
        c1 = c;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            c1.incVal(i);

        }
    }

}
