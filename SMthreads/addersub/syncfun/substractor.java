package syncfun;

public class substractor implements Runnable {

    counter c2;

    substractor(counter c) {
        c2 = c;
    }

    public void run() {

        for (int i = 0; i < 100; i++) {

            c2.decVal(i);
        }

    }
}
