package ChapterThree.CodingTask.Doing.CodingTaskTwo;

public class LibraryApp {

    /*
     * 5.In the main method of a class named LibraryApp, instantiate at least two
     * Book objects, set or modify their data using setters, and call displayInfo()
     * for each object.
     */
    public static void main(String[] args) {

        Book b1 = new Book("Condorito", "Pepo", 1515);
        Book b2 = new Book(b1);
        System.out.println(b1 + " - " + b2);
    }

}
