package english.chapterfour.codingtask.assignment.codingtasktwo;

public class Assignment {

    /*
     * Coding Task 2: Implement a Simple Inheritance Hierarchy
     *
     * Objective:
     * Understand and apply inheritance by creating a basic hierarchy of classes
     * with common and specific behaviors.
     *
     * Instructions:
     *
     * A. Create a base class Animal:
     *
     * Fields:
     * name (String): The name of the animal.
     * age (int): The age of the animal.
     *
     * Constructor:
     * Initialize name and age.
     *
     * Methods:
     * makeSound(): A method that prints a generic sound
     *              ("Some generic animal sound").
     * displayInfo(): A method that prints the animal's name and age.
     *
     * B. Create a subclass Dog that extends Animal:
     *
     * Constructor:
     * Call the superclass constructor to initialize the name and age.
     *
     * Methods:
     * Override the makeSound() method to print "Woof! Woof! Woof!".
     * Add a method fetch() that prints "Fetching the ball!".
     *
     * C. Create another subclass, Cat, that extends Animal:
     *
     * Constructor:
     * Call the superclass constructor to initialize the name and age.
     *
     * Methods:
     * Override the makeSound() method to print "Meow! Meow! Meow!".
     * Add a method purr() that prints "Purring softly!".
     *
     * D. Create a TestAnimal class with the main method:
     *
     * Instantiate objects of Dog and Cat.
     * Call their methods to demonstrate the behavior of each class.
     *
     * Here's the code for your TestAnimal class:
     *
     * public class TestAnimal {
     *     public static void main(String[] args) {
     *         Dog myDog = new Dog("Buddy", 3);
     *         Cat myCat = new Cat("Whiskers", 2);
     *
     *         myDog.displayInfo();
     *         myDog.makeSound();
     *         myDog.fetch();
     *
     *         myCat.displayInfo();
     *         myCat.makeSound();
     *         myCat.purr();
     *     }
     * }
     *
     * Here's the expected output:
     *
     * Name: Buddy, Age: 3
     * Woof! Woof! Woof!
     * Fetching the ball!
     * Name: Whiskers, Age: 2
     * Meow! Meow! Meow!
     * Purring softly!
     */
}
