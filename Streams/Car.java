package Streams;

public class Car {

    String brand;
    int price;

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
    
    public String toString() {

        return "car brand is " + brand + " " + " having price " + price;
    }

}
