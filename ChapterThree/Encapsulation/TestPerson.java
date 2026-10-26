package ChapterThree.Encapsulation;



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

        //aswering question page 171
        /*
        1. c
        2. a 
        3. a
        4. a
        5. b
        6. d
        7. b
        8. d
        9. d
        10. c
        */ 

    }
}