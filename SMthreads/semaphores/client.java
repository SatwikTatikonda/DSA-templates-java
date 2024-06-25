import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 * client
 */
public class client {

    public static void main(String[] args) {

        Queue<Object> store = new LinkedList<>();
        int cap = 5;
        Semaphore ps = new Semaphore(cap);
        Semaphore cs = new Semaphore(0);

        for (int i = 0; i <= 1000; i++) {

            producer p = new producer("p" + i, ps, cs, store);
            Thread Tp = new Thread(p);
            Tp.start();

            consumer c = new consumer("c" + i, ps, cs, store);
            Thread Tc = new Thread(c);
            Tc.start();
        }
    }
}