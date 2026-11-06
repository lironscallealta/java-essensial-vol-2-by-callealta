package english.cp05otherclassfeatures.codingtask.doing.codingtasktwo;

import english.cp05otherclassfeatures.codingtask.doing.codingtasktwo.programclasses.Article;
import english.cp05otherclassfeatures.codingtask.doing.codingtasktwo.programclasses.Content;


public class Main {
    public static void main(String[] args) {
        // Video video = new Video("Jurasick Park", "Steven",120);
        // Podcast podcast = new Podcast("Learning english in Spotify","Jason
        // Lennon",60,true);
        Article article = new Article("Politician article in new york time", "Julio Prado", 1200);
        executed(article);

    }

    public static void executed(Content content) {
        if (content instanceof Article c) {
            
            c.displayInfo();
            System.out.println("Calculate reading Time: " + c.calculateReadingTime());
            c.read();
        }
    }
}