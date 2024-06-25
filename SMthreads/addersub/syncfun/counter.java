package syncfun;

public class counter {

    private int val = 0;

    public counter(int v) {
        val = v;
    }

    public synchronized void incVal(int offset) {

        val += offset;
    }

    public synchronized void decVal(int offset) {

        val -= offset;
    }

    public synchronized int getVal() {
        return val;
    }
}
