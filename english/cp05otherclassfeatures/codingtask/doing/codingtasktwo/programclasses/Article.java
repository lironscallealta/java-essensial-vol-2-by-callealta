package english.cp05otherclassfeatures.codingtask.doing.codingtasktwo.programclasses;

public class Article extends Content implements Readable {
    private int wordCount;

    public Article(String title, String author, int wordCount) {
        super(title, author);
        this.wordCount = wordCount;

    }

    @Override
    public void displayInfo() {
        System.out.println("Author: " + this.author + ", Article: " + this.title + ".");
        System.out.println("Word count: " + wordCount);
    }

    @Override
    public Double calculateReadingTime() {

        return wordCount/ 200.0;
    }

    @Override
    public void read() {
        System.out.println("Article reading: " + this.title);
    }

    @Override
    public void publish() {
        
        super.publish();
        System.out.println(this.title);
    }

}
