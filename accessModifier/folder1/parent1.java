package accessModifier.folder1;

public class parent1 {

    private String email;
    int age;
    public String name;
    protected float psp;

    public parent1() {

        email = "abc@gmail.com";
        age = 21;
        name = "abc";
        psp = 70;

    }

    public void show() {
        System.out.println(email + " from parent class");
    }
}

class child1 extends parent1 {

    public void display() {
        System.out.println(age + " from trail1 child1 class");
        System.out.println(name + " from trail1 child1 class");
        System.out.println(psp + " from trail1 child1 class");
    }
}
