package polymorphism;

class Base {

    void display() {

        System.out.println(" i am from base display method");
    }

    void show1() {
        System.out.println(" i am from show 1");
    }

}

class Dervied extends Base {
    
    void display() {
        System.out.println("i am from derived display method ");
    }

    void show2() {
        System.out.println(" i am form show2");
    }
}

public class Main{
    public static void main(String[] args) {

        // Base b = new Dervied();
        // b.show1();
        // b.display();

        // Base b = new Base();
        // b.display();
        // b.show1();

        // Dervied d = new Dervied();
        // d.display();
        // d.show1();
        // d.show2();


        // Dervied d=new Base();
        
    }
}