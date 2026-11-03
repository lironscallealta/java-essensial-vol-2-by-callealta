package english.cp06otherclassfeatures.enumkeyword;

public class InnerPlanetsEnumExample {

    // Enums have been available since Java 5.
    enum InnerPlanets {
        MERCURY, VENUS, EARTH, MARS;
    }

    public static void main(String[] args) {
        System.out.println("Our home planet: " + InnerPlanets.EARTH);
    }
}