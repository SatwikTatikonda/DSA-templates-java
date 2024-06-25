package Funtional_Interfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoOnPopularFI {

    public static void main(String[] args) {
        
        Consumer<Integer> obj = new Consumer<Integer>() {

            public void accept(Integer integer) {
                System.out.println("consumer");
            }

        };

        BiConsumer<String, Integer> obj2 = new BiConsumer<String, Integer>() {

            public void accept(String s, Integer i) {
                System.out.println("Bi consumer");
            }
        };

        Predicate<Integer> obj3 = new Predicate<Integer>() {

            public boolean test(Integer i) {
                return false;

            }
        };

        BiPredicate<String, Integer> obj4 = new BiPredicate<String, Integer>() {

            public boolean test(String s, Integer i) {
                return false;

            }
        };

        Function<Integer, String> obj5 = new Function<Integer, String>() {

            @Override
            public String apply(Integer t) {
                return null;
            }

        };

        BiFunction<Integer, String, Double> obj6 = new BiFunction<Integer, String, Double>() {

            public Double apply(Integer i, String s) {

                return null;

            }
        };

        BinaryOperator<Integer> binaryOp = new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer t, Integer u) {
                return null;
            }

        };

    }

}
