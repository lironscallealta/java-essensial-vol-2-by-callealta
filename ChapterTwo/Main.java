package ChapterTwo;

public class Main {

    // The Referencie Data Types
    public static void main(String[] args) {
        Person p1 = new Person("Joan", 10);
        System.out.println("example 1");
        System.out.println(p1.toString());
        Person p2 = new Person();
        System.out.println("example 2");
        System.out.println(p2.toString());
        Person p3; /* initially set to null open up space in memory */
        p3 = new Person("P3Name", 45);
        Person p4 = p3;
        System.out.println(p3 + " Are the same " + p4);
        Person p5 = new Person(p3.name, p3.age);
        System.out.println(p5 + " Same information different hash " + p4);
        Person p6 = new Person("Test", 45);
        p5 = p6;
        System.out.println(p5 + " p5 -  now are different hash - p6 " + p6);
        System.out.println(p5.printDetails());
        System.out.println(p6.printDetails());
        // Book answer page 102 for me
        /*
        1. a
        2. a
        3. b
        4. c
        5. d
        6. d
        7. b
        8. a
        9. c
        10.d

        */



    }

}
