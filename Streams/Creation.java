package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Creation {
 
    // way1
    Integer[] arr = { 10, 20, 30, 40 };
    Stream<Integer> s1 = Stream.of(arr);

    // way2 
    Stream<Integer> s2 = Stream.of(10, 20, 30, 40, 50);

    // way3 
    List<Integer> list = Arrays.asList(10, 20, 30, 40);
    Stream<Integer> s3 = list.stream();

    // way4
    // Stream.Builder<Integer> sb = Stream.builder();
    // sb.accept(10);
    // sb.accept(20);
    // sb.accept(30);
    // sb.accept(40);
    // Stream<Integer> s4=sb.build();


}
