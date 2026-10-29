package english.chaptertwo.constructors;
/** Clase de apoyo: constructor de copia y creación de otra persona con addAge(). */
public class PersonTwo {

    private String name = "noname";
    private int age = 0;

    public PersonTwo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonTwo(PersonTwo per) {
        this.name = per.name;
        this.age = per.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /*here creates a new person, but I use this to change the object I'm creating 
    example if I put for example p1.addAge(25) I will create another new object in memory */
    public PersonTwo addAge(int moreAge) {
        PersonTwo newPerson = new PersonTwo(this);
        newPerson.age = newPerson.age + moreAge;
        return newPerson;
    }

    @Override
    public String toString() {
        return name + " at age " + age;
    }
}



