package Funtional_Interfaces;

public class DemoMain {
    
    public static void main(String[] args) {
        
        DemoInterfaces way1 = new DemoImplementations();
        way1.fun1();

        DemoInterfaces way2= new DemoInterfaces() {
            public void fun1() {
                System.out.println("anonymous classes way");
            }
        };

        way2.fun1();


    }
}
