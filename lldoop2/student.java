package lldoop2;

public class student {
    public String name;
    public int age;

    student() {
        System.out.println("calling custom cons with no params");
        this.name = "omsairam";
    }

    student(String name, int age) {
        System.out.println("cons with params is called");
        this.name = name;
        this.age = age;

    }

}
