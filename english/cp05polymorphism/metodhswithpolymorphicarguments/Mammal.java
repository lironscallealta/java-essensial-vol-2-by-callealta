package english.cp05polymorphism.metodhswithpolymorphicarguments;

public class Mammal extends Animal {

    public void feedYoung() {

        System.out.println("Feed Young");

    }

    @Override
    public void beathe() {
        System.out.println("Mammal beathe");
        
    }

    @Override
    public void eat() {
        System.out.println("Mammal Eats");
    }

    @Override
    public void sleep() {
        System.out.println("Mammal sleep");
    }
}
