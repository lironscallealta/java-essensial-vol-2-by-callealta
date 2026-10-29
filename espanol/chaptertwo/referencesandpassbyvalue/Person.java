package espanol.chaptertwo.referencesandpassbyvalue;

/** Clase de apoyo utilizada por ReferenceAssignmentExample y PassByValueExample. */
public class Person {
    public String name = "~sin nombre";
    public int age = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String printDetails() {
        return name + " con edad " + age;
    }

    public void setAge(int age) {
        this.age = age;
        
    }
}
