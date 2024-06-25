package Generics;

import java.util.Arrays;
import java.util.List;

class Demo {

    public double print(List<? extends Number> lst) {
        
        double res=0;
        for (Number n : lst) {
            res += n.intValue();
        }
        return res / lst.size();

    }
    
}

public class WildCards {
    
    public static void main(String[] args) {
        
        List<Integer> ls1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> ls2 = Arrays.asList(1.2, 2.2, 3.1, 4.6, 5.7);
        List<String> ls3 = Arrays.asList("A", "B", "T");

        Demo obj = new Demo();
        System.out.println(obj.print(ls1));
        System.out.println(obj.print(ls2));
        
        
    }
    
}
