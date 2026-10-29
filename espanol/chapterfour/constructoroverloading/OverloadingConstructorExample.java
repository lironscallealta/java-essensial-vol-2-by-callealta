package espanol.chapterfour.constructoroverloading;

import java.util.Date;

public class OverloadingConstructorExample {

    public static void main(String[] args) {

        // Nombre, sueldo y fecha de nacimiento.
        Employee p1 = new Employee("Julian", 20000, new Date());

        // Nombre y sueldo: birthDate queda en null.
        
        Employee p2 = new Employee("Julian", 20000);

        // Nombre y fecha de nacimiento: el sueldo predeterminado es BASE_SALARY (15000).
        Employee p3 = new Employee("Julian", new Date());
        System.out.println(p1.getDetails());
        p1.toString();
        System.out.println(p1.hashCode());
    }
}