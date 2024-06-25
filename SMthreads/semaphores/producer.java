import java.util.Queue;
import java.util.concurrent.Semaphore;

public class producer implements Runnable {

    private String name;
    private Semaphore ps;
    private Semaphore cs;
    private Queue<Object> store;

    public producer(String name, Semaphore ps, Semaphore cs, Queue<Object> store) {
        this.name = name;
        this.ps = ps;
        this.cs = cs;
        this.store = store;
    }

    public void run() {

        try {
            ps.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
        store.add(new Object());
        System.out.println(name + " added a shirt .Store size is now " + store.size());
        cs.release();

    }

}
