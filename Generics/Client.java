package Generics;

public class Client {

    public static void main(String[] args) {
        GenericClass<Integer> gt = new GenericClass<>(3);
        gt.toPrint();

        GenericClass<String> gs = new GenericClass<>("omsairam");
        gs.toPrint();

        GenericClass<Animal> ga = new GenericClass<>(new Animal("bolt", 7, "mewo-meow"));
        System.out.println(ga.showObj());

        

        genericPair<Integer, String> PIS = new genericPair<Integer, String>(20, "satwik");
        System.out.println(PIS.getFirst());

        genericPair<String, String> PSS= new genericPair<String, String>("om", "sairamn");
        System.out.println(PSS.getFirst());

        genericPair<Integer, genericPair<Integer, String>> nestedPair = new genericPair<>(7, PIS);
        
        genericPair<Integer, String> second = nestedPair.getSecond();
        System.out.println(second);

    }

}
