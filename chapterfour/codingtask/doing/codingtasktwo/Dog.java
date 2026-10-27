package chapterfour.codingtask.doing.codingtasktwo;

public class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof! Woof!");
    }

    public void fetch() {
        System.out.println("Fetching the ball!");
    }
}
