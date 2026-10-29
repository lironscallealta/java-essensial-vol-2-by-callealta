package espanol.chapterthree.codingtask.doing.codingtasktwo;

public class LibraryApp {

    /*
 * 5. En main de LibraryApp, crea al menos dos objetos Book, establece o modifica
 * sus datos mediante los métodos de modificación y llama a displayInfo() en cada uno.
 */
    public static void main(String[] args) {

        Book b1 = new Book("Condorito", "Pepo", 1515);
        Book b2 = new Book(b1);
        System.out.println(b1 + " - " + b2);
        b1.displayInfo();
        b2.displayInfo();
    }

}
