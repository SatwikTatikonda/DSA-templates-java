package Funtional_Interfaces;

import lldoop2.student;

public class AnonymousClass {
    
    public static void main(String[] args) {
        
            Client c= new Client(){

                public void show() {
                    System.out.println(" i am in child class of client");
                }
                
                public void newMethod() {
                    System.out.println(" i am in newMethod in child of client");
                }
                

            };

            c.show();
            // c.newMethod();

            





    }

}
