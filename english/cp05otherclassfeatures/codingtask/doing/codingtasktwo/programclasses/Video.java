package english.cp05otherclassfeatures.codingtask.doing.codingtasktwo.programclasses;

public class Video extends Content implements Watchable {
    private double duration; // duration in minutes

    public Video(String title, String autor, double duration) {
        super(title, autor);
        this.duration = duration;

    }

    @Override
    public void displayInfo() {
        System.out.println("Author: " + this.author + " Title : " + this.author);
        System.out.println("Duration: " + duration);

    }

    @Override
    public Double calculateReadingTime() {

        return null;
    }

    @Override
    public void watch() {

    }

}
