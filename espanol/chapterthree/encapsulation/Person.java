package espanol.chapterthree.encapsulation;

// Person.java
public class Person {

    private String name;
    private int age;

    // Métodos de modificación (setters).
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        if (a >= 0) {
            age = a;
        } else {
            age = 0;
        }
    }

    // Métodos de consulta (getters).
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
