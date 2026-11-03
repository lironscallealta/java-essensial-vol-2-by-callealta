package english.cp06otherclassfeatures.enumkeyword;

public class InnerPlanetsEnumExample {

    // Enums have been available since Java 5.
    //
    // An enum is a special class with a fixed set of named objects.
    // InnerPlanets is the type; MERCURY, VENUS, EARTH, and MARS
    // are objects of that type, created automatically by Java.
    // We choose one of these values instead of creating one with new.
    /* protected or private */
    enum InnerPlanets { // It is declared inside a class, Can be private o protected:
        MERCURY, VENUS, EARTH, MARS; // private or protected -> could be
    }

    public static void main(String[] args) {

        // The variable planet refers to the enum object EARTH.
        InnerPlanets planet = InnerPlanets.EARTH;

        // Printing the object uses its toString() method.
        // By default, an enum returns its constant name: "EARTH".
        // This prints EARTH, not the variable name "planet".
        System.out.println("Our home planet: " + planet);
    }
}