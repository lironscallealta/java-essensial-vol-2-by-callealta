package espanol.chapterfive.downcasting;

public class Director2 extends Manager2 {

    double carAllowance;

    @Override
    public String getDetails() {
        return super.getDetails()
                + "\nAsignación para automóvil: " + carAllowance;
    }

    public void playGolf() {
        System.out.println("Jugar golf..");
    }
}