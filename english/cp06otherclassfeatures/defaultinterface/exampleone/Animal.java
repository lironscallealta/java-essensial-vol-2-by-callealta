package english.cp06otherclassfeatures.defaultinterface.exampleone;

// Animal.java

public interface Animal {

    // These methods have no body, so every concrete class that implements
    // Animal must provide their implementations.
    // Interface methods are public automatically.
    void eat();

    void sleep();

    void breathe();

    // "default" gives this interface method a ready-to-use implementation.
    // Implementing classes inherit it and may override it if needed.
    // A default method in an interface is public.
    default void play() {
        System.out.println("Animal is having fun.");
    }
}
