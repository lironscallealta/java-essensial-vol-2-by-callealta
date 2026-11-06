package english.cp05otherclassfeatures.codingtask.doing.codingtasktwo.programclasses;

public class Video extends Content implements Watchable {
    private double duration; // duration in minutes

    public Video(String title, String autor, double duration) {
        super(title, autor);
        this.duration = duration;

    }

    @Override
    public void displayInfo() {
        System.out.println("Author: " + this.author + ", film : " + this.title);

    }

    @Override
    public Double calculateReadingTime() {

        return this.duration;
    }

    @Override
    public void watch() {
        System.out.println("Film playing: " + this.title);

    }

    @Override
    public void publish() {

        super.publish();
        System.out.println(this.title);
    }

}
