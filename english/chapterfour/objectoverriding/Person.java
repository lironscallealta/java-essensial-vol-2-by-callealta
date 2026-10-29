package english.chapterfour.objectoverriding;

public class Person extends Object {

    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Override the equals method.
    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj != null && obj instanceof Person) {
            Person p = (Person) obj;

            if (this.getName().equals(p.getName())
                    && this.getAge() == p.getAge()) {
                result = true;
            }
        }

        return result;
    }

    // Override the hashCode method.
    @Override
    public int hashCode() {
        return getName().hashCode() ^ getAge();
    }

    // Override the toString method.
    @Override
    public String toString() {
        return getName() + ", at age " + getAge();
    }
}
