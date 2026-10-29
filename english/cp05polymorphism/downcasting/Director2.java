package english.cp05polymorphism.downcasting;

public class Director2 extends Manager2 {

    double carAllowance;

    @Override
    public String getDetails() {
        return super.getDetails()
                + "\nCar Allowance: " + carAllowance;
    }

    public void playGolf() {
        System.out.println("Play Golf..");
    }
}