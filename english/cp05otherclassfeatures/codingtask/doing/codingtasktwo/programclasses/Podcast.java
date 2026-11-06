package english.cp05otherclassfeatures.codingtask.doing.codingtasktwo.programclasses;

public class Podcast extends Content implements Readable, Watchable {
    private double duration;
    private boolean transcript;

    public Podcast(String title, String author, double duration, boolean transcript) {
        super(title, author);
        this.duration = duration;
        this.transcript = transcript;
    }

    @Override
    public void displayInfo() {
        System.out.println("Author: " + this.author + " Title : " + this.author);
        System.out.println("duration: " + duration);
        if (transcript) {
            System.out.println("transcript available: " + transcript);
        } else
            System.out.println("No transcription available");

    }

    @Override
    public void read() {
        System.out.println("podcast reading: " + this.title);
    }

    @Override
    public void watch() {
        System.out.println("podcast video watching: " + this.title);

    }

    @Override
    public Double calculateReadingTime() {
        return this.duration;
    }

    @Override
    public void publish() {

        super.publish();
        System.out.println(this.title);
    }

}
