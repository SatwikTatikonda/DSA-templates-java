package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;
 


public class Filter {
    

    public static void main(String[] args) {

        // Predicate<Integer> pred=(x) -> x%2==0;
        // List<Integer> list = Arrays.asList(2, 3, 5, 7, 9,4,10,6,11);
        List<Integer> list = List.of(2, 3, 5, 7, 9,4,10,6,11);
    
    
        List<Integer> evenNumbers = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(evenNumbers);

        List<Integer> odd = list.stream().filter(e -> e % 2 != 0).sorted().collect(Collectors.toList());
        System.out.println("join numbers from list wch are greater than 5 "+list.stream().filter(e->e>5).map(e->""+e).collect(Collectors.joining()));
        System.out.println("number of elements greater than 7 are "+list.stream().filter(e->e>7).count());
        System.out.println("sorting numbers in reverse order "+list.stream().sorted((e1,e2)->e2-e1).toList());        
    
    

        List<Car> carList = Arrays.asList(new Car("BMW", 100), new Car("BENZ", 800), new Car("AUDI", 500),new Car("BENZ",1200));
        carList.stream().filter(c -> c.price >= 500).forEach(newc -> System.out.println(newc.toString()));

        carList.stream().sorted((c1, c2) -> {

            if (c1.brand.equals(c2.brand)) {
                return c1.price - c2.price;

            }
            else {

                return c1.brand.compareTo(c2.brand);

            }
        
        }).forEach(c -> System.out.println(c.toString()));
        


        
    
    }

}
