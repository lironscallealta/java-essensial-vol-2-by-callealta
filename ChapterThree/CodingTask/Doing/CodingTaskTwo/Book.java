package chapterthree.codingtask.doing.codingtasktwo;

/*
    * Instructions:
    * 1.Create a class named Book with the following private fields:
    * ●String title
    * ●String author
    * ●int yearPublished
    * 2.Add a constructor that initializes all three fields.
    * 3.Provide public getter and setter methods for each field.
    * 4.Add an instance method named displayInfo() that prints the book’s details
    * in the format:
    * "Title: <title>, Author: <author>, Yr: <yrPublished>"
    * 5.In the main method of a class named LibraryApp, instantiate at least two
    * Book objects, set or modify their data using setters, and call displayInfo()
    * for each object.
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
        System.out.println("Title: " + title +", Author: " + autor + ", Yr: " + yearPublished);
    }



}

