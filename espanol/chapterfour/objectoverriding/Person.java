package espanol.chapterfour.objectoverriding;

public class Person extends Object {

    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Métodos de consulta (getters).
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Sobrescribe el método equals.
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

    // Sobrescribe el método hashCode.
    @Override
    public int hashCode() {
        return getName().hashCode() ^ getAge();
    }

    // Sobrescribe el método toString.
    @Override
    public String toString() {
        return getName() + ", con edad " + getAge();
    }
}
