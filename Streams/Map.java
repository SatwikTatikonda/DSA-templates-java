package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Map {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 7, 9, 4, 10, 6, 11);


        System.out.println("reduce " + list.stream().reduce(0, (cursum, ele) -> cursum + ele));
        
        List<String> wlst = Arrays.asList("omsairam", "satwik", "kohli", "kashmir");
        System.out.println(wlst.stream().collect(Collectors.joining("-")));

        List<Integer> evens = Arrays.asList(2, 4, 12, 46, 6, 80, 24, 16);

        System.out.println("all match to even " + evens.stream().allMatch(e -> e % 2 == 0));

        

        
        List<Car> carList = Arrays.asList(new Car("BMW", 100), new Car("BENZ", 800), new Car("AUDI", 500),new Car("BENZ",1200));
        
        // Function<Integer,Integer> f= ()
        List<Integer> result =list.stream().map(x -> x * 2).toList();
        System.out.println(result);

        List<String> lst = Arrays.asList("omsairam", "swapna", "satwik", "rukhsar");

        System.out.println("grouping by length "+lst.stream().collect(Collectors.groupingBy(e->e.length())));
        System.out.println(lst.stream().map(word -> word.length()).toList());
        System.out.println(lst.stream().map(word -> word.length()).collect(Collectors.toList()));
        System.out.println(lst.stream().filter(w->w.startsWith("s")).sorted((w1,w2)->w1.compareTo(w2)).toList());
        

        
        // Optional<Integer> priceSum=carList.stream().reduce((car1.price, car2.price) -> car1.price + car2.price);
        
        // The error occurs because you're trying to use the reduce method directly on the price fields of car1 and car2, which isn't valid in Java. The reduce method operates on the elements of the stream, not their fields. To achieve the desired summing of the price fields, you need to transform the carList stream into a stream of Integer values representing the prices of the cars.

        Optional<Integer> priceSum = carList.stream().map(car -> car.price).reduce((car1, car2) -> car1 + car2);
        if (priceSum.isPresent()) {
            System.out.println(priceSum.get());
        }
    }
    


}
