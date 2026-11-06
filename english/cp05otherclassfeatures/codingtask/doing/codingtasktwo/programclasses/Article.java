package english.cp05otherclassfeatures.codingtask.doing.codingtasktwo.programclasses;

public class Article extends Content implements Readable {
    private int wordCount;

    Article(String title, String author, int wordCount) {
        super(title, author);
        this.wordCount = wordCount;

    }

    @Override
    void displayInfo() {
        System.out.println("Author: " + this.author + "Title : " + this.author);
        System.out.println("Word count: " + wordCount);
    }

    @Override
    public Double calculateReadingTime() {

        return 4.5;
    }

    @Override
    public void read() {
        System.out.println("Article is being read");
    }

}
