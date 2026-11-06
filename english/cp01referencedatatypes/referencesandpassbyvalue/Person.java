package english.cp01referencedatatypes.referencesandpassbyvalue;

/** Supporting class used by ReferenceAssignmentExample and PassByValueExample. */
public class Person {
    public String name = "~noname";
    public int age = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String printDetails() {
        return name + " at age " + age;
    }

    public void setAge(int age) {
        this.age = age;
        
    }
}
