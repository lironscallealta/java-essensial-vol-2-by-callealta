package english.cp05polymorphism.metodhswithpolymorphicarguments;

public class Bird extends Animal {

    public void layEggs() {
        System.out.println("Lay Eggs");
    }

    public void buildNest() {
        System.out.println("Build Nests");

    }

    @Override
    public void beathe() {
        System.out.println("bird beathe");

    }

    @Override
    public void eat() {
        System.out.println("bird Eats");
    }

    @Override
    public void sleep() {
        System.out.println("bird sleep");
    }

}
