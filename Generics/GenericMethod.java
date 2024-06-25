package Generics;


class print {
    
    
    public  <T> void display(T value) {
        System.out.println(value);
    }
    
    public <T> T getBack(T value) {
        
        return value;
    }


    // take 2 numbers and return their sum
    // To restrict type of parameters to only  Integer,Float,Double
    // we make it bounded by Extending it from numbers class


    // public <T extends Number> T add(T a, T b) {
    //     return a + b;
    // }

}
public class GenericMethod {
    
 
    public static void main(String[] args) {
        
        print p = new print();
        p.display(10);
        p.display("sairam");
        p.display(32L);

        Integer backInteger = p.getBack(90);
        String backString= p.getBack("om");
        Long backLong = p.getBack(90L);

        // System.out.println( p.add(3, 4)); 
        // System.out.println(p.add(3.14, 5.241));
        



}

}
