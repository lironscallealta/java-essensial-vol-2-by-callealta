package espanol.chapterthree.encapsulation;



// TestPerson.java
public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        // Asigna los nombres.
        p1.setName("Lawrence");
        p2.setName("Walter");

        // Asigna las edades.
        p1.setAge(30);
        p2.setAge(-5);

        System.out.println(p1.getName() + " tiene "
                + p1.getAge() + " años.");

        System.out.println(p2.getName() + " tiene "
                + p2.getAge() + " años.");

    }
}