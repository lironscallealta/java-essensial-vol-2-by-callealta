package english.cp02variablesreferencesandconstructors.constructors;
/** Copy constructor: use PersonTwo.addAge() to create another object. */
public class CopyConstructorExample {

    public static void main(String[] args) {
        PersonTwo p1 = new PersonTwo("Lawrence", 20);
        PersonTwo olderPerson = p1.addAge(10);

        System.out.println(olderPerson);
    }
}



