package english.cp05otherclassfeatures.codingtask.doing.codingtasktwo.programclasses;

public abstract class Content {

    protected String title;
    protected String author;

    Content(String title, String autor) {
        this.title = title;
        this.author = autor;
    }

    abstract void displayInfo();

    public abstract Double calculateReadingTime();

    public void publish() {
        System.out.println("The content is published");
    }

}
