package ChapterTwo.Constructors;
/** Constructor de copia: usar PersonTwo.addAge() para crear otro objeto. */
public class CopyConstructorExample {

    public static void main(String[] args) {
        PersonTwo p1 = new PersonTwo("Lawrence", 20);
        PersonTwo olderPerson = p1.addAge(10);

        System.out.println(olderPerson);
    }
}



