package english.cp05polymorphism.codingtask.doing.codingtasktwo;

public class Bird extends Animal {

    @Override
    public void makeSound() {
        System.out.println("chirp");
    }

    @Override
    public void move() {
        System.out.println("bird is flying");
    }

}
