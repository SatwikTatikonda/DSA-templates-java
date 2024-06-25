package inheritance;

class parent {

    int var;

    parent() {
        var = 10;
        System.out.println("parent default");
    }

    parent(int val) {
        System.out.println("parent parameterised cons " + val);
    }

}

class child extends parent {

    int var;
    child() {
        var = 20;
        System.out.println("child defualt");
    
    }
    
    child(int val1, int val2) {
        super(val1);
        System.out.println("child parameterised " + val2);
    }

}

public class Main {

    public static void main(String[] args) {

        // child c = new child();
        // child c = new child(3, 5);
        parent p = new child();
        System.out.println(p.var);
    }
}
