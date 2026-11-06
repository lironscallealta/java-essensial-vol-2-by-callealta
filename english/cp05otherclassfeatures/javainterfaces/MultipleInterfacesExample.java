package english.cp05otherclassfeatures.javainterfaces;

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

// An interface can extend multiple interfaces.
// Anything implementing these abilities must provide swim() and fly().
interface DuckAbilities extends Swimmable, Flyable {
    void quack();
}

class Animal {

    public void eat() {
        System.out.println("The animal eats.");
    }
}

// A class can extend one class and implement multiple interfaces.
class Duck extends Animal implements Swimmable, Flyable {

    @Override
    public void swim() {
        System.out.println("The duck swims.");
    }

    @Override
    public void fly() {
        System.out.println("The duck flies.");
    }
}

// Implementing DuckAbilities requires all three methods:
// swim(), fly(), and quack().
class AnotherDuck extends Animal implements DuckAbilities {

    @Override
    public void swim() {
        System.out.println("Another duck swims.");
    }

    @Override
    public void fly() {
        System.out.println("Another duck flies.");
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

public class MultipleInterfacesExample {

    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.eat();  // Inherited from Animal.
        duck.swim(); // Required by Swimmable.
        duck.fly();  // Required by Flyable.

        AnotherDuck anotherDuck = new AnotherDuck();

        anotherDuck.eat();   // Inherited from Animal.
        anotherDuck.swim();  // Required through DuckAbilities.
        anotherDuck.fly();   // Required through DuckAbilities.
        anotherDuck.quack(); // Declared directly in DuckAbilities.
    }
}