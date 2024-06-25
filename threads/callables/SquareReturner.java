package threads.callables;

import java.util.concurrent.Callable;

public class SquareReturner implements Callable<Integer> {

    Integer number;

    SquareReturner(Integer number) {
        this.number = number;
    }

    public Integer call() {
        return (number * number);
    }

}
