package iterator2;

import java.util.*;

public class NumPrinter implements Iterable<Integer> {
    
    List<Integer> numbers;
    public NumPrinter(List<Integer> num) {
        this.numbers = num; 
    }
    public Iterator<Integer> iterator() {
        
        return new NumIterator(this);
    }

   

}
