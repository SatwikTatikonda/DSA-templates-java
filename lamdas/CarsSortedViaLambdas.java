package lamdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarsSortedViaLambdas {

    static class car {
        int speed;
        int price;
        String brand;

        car(int speed, int price, String brand) {

            this.speed = speed;
            this.price = price;
            this.brand = brand;

        }

        public String toString() {

            return "[s= " + this.speed + " ,P= " + this.price + " b= " + this.brand + " ]\n";

        }

    }

    public static void main(String[] args) {

        car c1 = new car(200, 1000, "Benz");
        car c2 = new car(100, 2000, "Audi");
        car c3 = new car(400, 4000, "BMW");
        car c4 = new car(500, 8000, "Ferrari");

        List<car> list = Arrays.asList(c2, c2, c3, c4);

        Comparator<car> speedComparator = (car1, car2) -> car1.speed - car2.speed;

        Collections.sort(list, speedComparator);
        System.out.println(list);

        System.out.println("************");
        System.out.println(list.stream().sorted((s1, s2) -> s1.speed - s2.speed).toList());

    }
}
