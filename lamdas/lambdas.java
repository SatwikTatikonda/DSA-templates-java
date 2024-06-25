package lamdas;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class lambdas {

    public static void main(String[] args) {
        
        BiPredicate<Integer, String> way2 = new BiPredicate<Integer, String>() {
            
            public boolean test(Integer i,String s){
                return true;
        }
            
        };

        System.out.println(way2.test(3,"hello"));

        BiPredicate<Integer, String> way1 = new DemoClassForBiPredeicate();

        BiPredicate<Integer, String> way3 = (minlen,str) -> {
            
            if (str.length() > minlen) {
                return true;
            }
            else {
                return false;
            }
            
        };
        
        System.out.println(way3.test(3,"omsairam"));

        // usign binaryOpreator-------

        BinaryOperator<String> obj = (s1, s2) -> {

            return s1 + s2;
        };

             
        BinaryOperator<String> obj2=(s1,s2)->s1+s2;

        System.out.println(obj.apply("one","chance"));


        // using Biconsumer 

        BiConsumer<Integer,Integer> obj3=(num,str)->{
            System.out.println(num+" "+str);
        };
        obj3.accept(10,12);

    }
    
}
