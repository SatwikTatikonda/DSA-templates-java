package iterator2;

import java.util.Iterator;

public class NumIterator implements Iterator<Integer> {


    int idx;
    NumPrinter num;

    public NumIterator(NumPrinter num) {
        idx = 0;
        this.num = num;
    }
    
    public boolean hasNext() {
        
        while (idx < num.numbers.size()) {
            if (num.numbers.get(idx) % 5 == 0) {
                break;
            }
        }
        return idx!=num.numbers.size();
       
    }

    @Override
    public Integer next() {
       
        Integer val=num.numbers.get(idx);
        idx += 1;
        return val;
    }
    
    
}
