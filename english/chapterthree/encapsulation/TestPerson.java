package english.chapterthree.encapsulation;



// TestPerson.java
public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        // Assign names
        p1.setName("Lawrence");
        p2.setName("Walter");

        // Assign ages
        p1.setAge(30);
        p2.setAge(-5);

        System.out.println(p1.getName() + " is "
                + p1.getAge() + " years old.");

        System.out.println(p2.getName() + " is "
                + p2.getAge() + " years old.");

    }
}