package chapterfour.objectoverriding;



public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("Lawrence", 30);
        Person p2 = new Person("Lawrence", 30);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1);
        System.out.println(p2.toString());
    }
}