package english.cp05otherclassfeatures.codingtask.doing.codingtasktwo;

import english.cp05otherclassfeatures.codingtask.doing.codingtasktwo.programclasses.Article;
import english.cp05otherclassfeatures.codingtask.doing.codingtasktwo.programclasses.Content;
import english.cp05otherclassfeatures.codingtask.doing.codingtasktwo.programclasses.Podcast;
import english.cp05otherclassfeatures.codingtask.doing.codingtasktwo.programclasses.Video;

public class Main {
    public static void main(String[] args) {

        Article article = new Article("Politician article in new york time", "Julio Prado", 1200);
        Video video = new Video("Jurasick Park", "Spilber", 130);
        Podcast podcast = new Podcast("Learning Enlgish with native Speakers", "Miriam", 30, false);
        System.out.println("--------------------------");
        executed(article);
        System.out.println("--------------------------");
        executed(video);
        System.out.println("--------------------------");
        executed(podcast);

    }

    public static void executed(Content content) {
        if (content instanceof Article art) {

            art.displayInfo();
            art.publish();
            System.out.println("Estimate reading duration: " + art.calculateReadingTime() + " minutes");
            art.read();
        } else if (content instanceof Video) {
            Video vi = (Video) content;
            vi.displayInfo();
            vi.publish();
            System.out.println("Estimate film duration: " + vi.calculateReadingTime() + " minutes");
            vi.watch();
        } else if (content instanceof Podcast pod) {
            pod.displayInfo();
            pod.publish();
            System.out.println("Estimate podcast duration: " + pod.calculateReadingTime() + " minutes");
            pod.read();
            pod.watch();

        }
    }
}