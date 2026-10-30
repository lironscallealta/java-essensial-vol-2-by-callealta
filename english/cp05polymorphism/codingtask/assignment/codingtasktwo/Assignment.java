package english.cp05polymorphism.codingtask.assignment.codingtasktwo;

public class Assignment {

    /*
     * Coding Task 2: The Animal Kingdom
     *
     * Description:
     * Create an animal class hierarchy. Animal is the base class; Dog, Cat and Bird
     * are derived classes. Each animal has a makeSound method that prints its sound.
     * Demonstrate polymorphism with a method receiving an Animal reference and
     * calling makeSound on it.
     *
     * Requirements:
     *
     * A. Create the base class Animal:
     * - makeSound prints a generic message such as "Some sound".
     * - move prints a generic message such as "Animal is moving".
     *
     * B. Create the derived classes Dog, Cat and Bird:
     * - Override makeSound with the specific sound: "Bark", "Meow" and "Chirp".
     * - Override move with the specific movement: "Dog is running",
     *   "Cat is pouncing" and "Bird is flying".
     *
     * C. Demonstrate polymorphism:
     * - Write printAnimalSound, receiving an Animal and calling makeSound.
     * - Create a list of Animal objects containing Dog, Cat and Bird instances.
     * - Iterate and call printAnimalSound for each animal.
     * - This part of the exercise is already provided below. The supplied code
     *   uses an Animal[] array.
     *
     * Provided code structure:
     *
     * class Animal {
     *     // put codes here
     * }
     *
     * class Dog extends Animal {
     *     // put codes here
     * }
     *
     * class Cat extends Animal {
     *     // put codes here
     * }
     *
     * class Bird extends Animal {
     *     // put codes here
     * }
     *
     * public class AnimalKingdom {
     *     public static void printAnimalSound(Animal a) {
     *         a.makeSound();
     *     }
     *
     *     public static void main(String[] args) {
     *         Animal[] animals = { new Dog(),
     *                              new Cat(),
     *                              new Bird() };
     *
     *         for (Animal animal : animals) {
     *             printAnimalSound(animal);
     *             animal.move();
     *         }
     *     }
     * }
     *
     * Tasks:
     * - Implement Animal, Dog, Cat and Bird as described.
     * - Implement printAnimalSound to demonstrate polymorphism.
     * - Create an Animal array populated with Dog, Cat and Bird instances.
     * - Iterate, calling printAnimalSound and move for each animal to demonstrate
     *   polymorphism and method overriding.
     *
     * Expected output:
     *
     * Bark
     * Dog is running
     * Meow
     * Cat is pouncing
     * Chirp
     * Bird is flying
     */
}
