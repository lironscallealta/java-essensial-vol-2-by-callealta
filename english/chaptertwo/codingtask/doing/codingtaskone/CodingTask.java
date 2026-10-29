package english.chaptertwo.codingtask.doing.codingtaskone;

/** Ejercicio en curso: consulta el enunciado en assignment/codingtaskone desde la carpeta codingtask. */
public class CodingTask {
    /*
     * Objective:
     * Write a Java program that demonstrates your understanding of primitive data
     * types, reference data types, user-defined classes, reference assignments,
     * pass-by-value, local variable scopes, and the this reference.
     */

    /*
     * Requirements:
     * 1. Create a User-Defined Class named Person:
     * Define a class Person with the following attributes: String name and an int
     * age.
     * Include the following methods in the Person class:
     * ● Constructor to accept a String name and int age value to initialize name
     * and
     * age attributes.
     * ● updateAge() method that accepts a Person object and an int value to update
     * the age of the passed person object.
     * ● incrementAge() method that increments the age of the current person and
     * returns the updated person object.
     * ● displayInfo() method that prints the name and age of the person.
     * 2. Main Program:
     * Create a Person object and initialize it with a name and age values as stated
     * in the constructor.
     * Pass the Person object to a method to update its age using updateAge().
     * Use incrementAge() to increment the age of the Person object and assign it to
     * a new reference variable.
     * Demonstrate the effect of changing the reference variable and local variable
     * scope on the Person object.
     * Use the this keyword within the Person class to handle method reuse.
     */

    public static void main(String[] args) {

        PersonFour p1 = new PersonFour("AnyName", 25);
        System.out.println("current age");
        p1.displayInfo();

        System.out.println();
        System.out.println("updating age");
        p1.updateAge(p1, 30);
        p1.displayInfo();

        // PersonFour newPersonOlder = new PersonFour(p1); this line is not necessary
        System.out.println();
        System.out.println("increase age");
        PersonFour newPersonOlder = p1.incrementAge(4);
        newPersonOlder.displayInfo();

    }

}

class PersonFour {
    public String name;
    public int age;

    PersonFour(String name, int age) {
        this.name = name;
        this.age = age;

    }

    PersonFour(PersonFour per) {
        this.name = per.name;
        this.age = per.age;

    }

    public void updateAge(PersonFour person, int updateAge) {

        person.age = updateAge;

    }

    public PersonFour incrementAge(int increseAge) {

        PersonFour newPerson = new PersonFour(this);
        newPerson.age += increseAge;
        return newPerson;

    }

    public void displayInfo() {
        System.out
                .println(
                        "Name's Person is : " + this.name + ". Age's person is: " + this.age + " Object hash: " + this);
    }
}
