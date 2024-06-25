package syncblock;

import java.util.*;
public class clientSync {

    public static void main(String[] args) throws InterruptedException {

        Map<Integer,Integer> mp=new HashMap<>();

        counter c = new counter();
        c.val = 100000;
        adder a = new adder(c);
        Thread t1 = new Thread(a);
        t1.start();
        substractor s = new substractor(c);
        Thread t2 = new Thread(s);
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.val);

    }

}
