package espanol.chaptertwo.constructors;
/** Clase de apoyo: constructor de copia y creación de otra persona con addAge(). */
public class PersonTwo {

    private String name = "sin nombre";
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

    /*
 * Aquí se crea una persona nueva a partir de this.
 * Por ejemplo, p1.addAge(25) crea otro objeto en memoria con la edad modificada.
 */
    public PersonTwo addAge(int moreAge) {
        PersonTwo newPerson = new PersonTwo(this);
        newPerson.age = newPerson.age + moreAge;
        return newPerson;
    }

    @Override
    public String toString() {
        return name + " con edad " + age;
    }
}



