package Generics;

public class GenericClass<T> {

    T obj;

    public GenericClass(T obj) {
        this.obj = obj;
    }

    public String showObj() {
        return this.obj.toString();

    }

    public void toPrint() {
        System.out.println(this.obj);
    }


}