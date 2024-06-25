package reflections.reflectionsDemo;

import java.util.ArrayList;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class loadConstructors {

    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            NoSuchFieldException, SecurityException {

        try {
            Class personDetails = Class.forName("reflections.reflectionsDemo.Person");
            Constructor[] cons = personDetails.getDeclaredConstructors();
            for (Constructor c : cons) {
                System.out.println(c.getParameterCount());
            }

            Constructor conWith2para = personDetails.getDeclaredConstructor(int.class, String.class);

            Object p = conWith2para.newInstance(10, "sairam");
            System.out.println(p);

            // getting attribute values
            Field ageField = personDetails.getDeclaredField("age");
            ageField.setAccessible(true);
            int value = (int) ageField.get(p);
            System.out.println(value);

            // changing value of private filed
            ageField.set(p, 20);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
