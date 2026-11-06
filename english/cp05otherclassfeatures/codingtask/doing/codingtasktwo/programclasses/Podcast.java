package english.cp05otherclassfeatures.codingtask.doing.codingtasktwo.programclasses;

public class Podcast extends Content implements Readable, Watchable {
    private double duration;
    private boolean transcript;

    public Podcast(String title, String author, double duration, boolean transcript){
        super(title, author);
        this.duration = duration;
        this.transcript = transcript;
    }
    @Override
    void displayInfo() {
        System.out.println("Author: " + this.author + " Title : " + this.author);
        System.out.println("duration: " + duration);
        if (transcript) {
           System.out.println("transcript: " + transcript); 
        }
        else System.out.println("No transcription available");
        
        
    }
    @Override
    public void read() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void watch() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public Double calculateReadingTime() {
        return null;
    }


}
