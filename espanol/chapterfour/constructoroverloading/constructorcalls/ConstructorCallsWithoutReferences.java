package espanol.chapterfour.constructoroverloading.constructorcalls;

import java.util.Date;

import espanol.chapterfour.constructoroverloading.Employee;

public class ConstructorCallsWithoutReferences {

    public static void main(String[] args) {

        // Nombre, sueldo y fecha de nacimiento.
         new Employee("Julian", 20000, new Date());

        // Nombre y sueldo: birthDate queda en null.
        
         new Employee("Julian", 20000);

        // Nombre y fecha de nacimiento: el sueldo predeterminado es BASE_SALARY (15000).
        new Employee("Julian", new Date());
 
    }
}