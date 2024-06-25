package iterator2;

import java.util.List;

public class client {
    
    public static void main(String[] args) {
        
        System.out.println("printing started");
        List<Integer>n=List.of(4, 10, 22, 5, 13, 15);
        NumPrinter np = new NumPrinter(n);
        for (Integer i : np) {
            System.out.println(i);
        }
        System.out.println("printing done");

    }

}