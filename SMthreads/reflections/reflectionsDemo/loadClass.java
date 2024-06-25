package reflections.reflectionsDemo;

// import javax.management.RuntimeErrorException;

public class loadClass {
    public static void main(String[] args) {

        try {

            Class PersonDetails = Class.forName("reflections.reflectionsDemo.Person");
            System.out.println(PersonDetails.getSimpleName());

        } catch (ClassNotFoundException e) {
            System.out.println("error occured");
            throw new RuntimeException(e);
        }
    }
}
