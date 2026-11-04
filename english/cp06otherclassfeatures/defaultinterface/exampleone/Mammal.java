package english.cp06otherclassfeatures.defaultinterface.exampleone;

// Mammal.java

public class Mammal implements Animal {

    @Override
    public void eat() {
        // Add the code for how a mammal eats.
    }

    @Override
    public void sleep() {
        // Add the code for how a mammal sleeps.
    }

    @Override
    public void breathe() {
        // Add the code for how a mammal breathes.
    }

    // Mammal does not override play(), so it inherits the implementation
    // from Animal. Calling mammal.play() prints:
    // "Animal is having fun."
}