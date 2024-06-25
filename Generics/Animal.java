package Generics;

public class Animal {

    String name,sound;
    int age;
    
    public Animal(String name,int age,String sound){
     
     this.name=name;
     this.age=age;
     this.sound=sound;
        
    }
    
    public String toString(){
        return(this.name+" is of age "+this.age+" and makes sound: "+this.sound);
    }
    
}
