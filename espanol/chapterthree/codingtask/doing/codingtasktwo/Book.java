package espanol.chapterthree.codingtask.doing.codingtasktwo;

/*
 * Ejercicio de programación 2:
 * 1. Crea Book con los campos privados String title, String author e int yearPublished.
 * 2. Agrega un constructor que inicialice los tres campos.
 * 3. Proporciona métodos públicos de consulta y modificación para cada campo.
 * 4. Agrega displayInfo(), un método de instancia que muestre los datos así:
 *    "Título: <title>, Autor: <author>, Año: <yearPublished>"
 * 5. En main de LibraryApp, crea al menos dos objetos Book, establece o modifica
 *    sus datos con los métodos de modificación y llama a displayInfo() en cada uno.
 */
public class Book {

    private String title;
    private String autor;
    private int yearPublished;

    Book(String title, String autor, int yearPublished) {
        this.title = title;
        this.autor = autor;
        this.yearPublished = yearPublished;
    }

    Book(Book book) {
        title = book.title;
        autor = book.autor;
        yearPublished = book.yearPublished;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAutor(String autor) {
        this.autor = autor;

    }

    public void setYearPublished(int yearPublished) {

        this.yearPublished = yearPublished;

    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void displayInfo(){
        System.out.println("Título: " + title +", Autor: " + autor + ", Año: " + yearPublished);
    }



}

