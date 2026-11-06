package english.cp05otherclassfeatures.abstractfeature;

public class Bird extends Animal {
    @Override
    public void eat() {

        System.out.println("Bird eats");
    }

    @Override
    public void breathe() {
        System.out.println("Bird Breathe");

    };

    @Override 
    public  void sleep(){
        System.out.println("Bird Sleeps");

    };

    public void layEggs() {
        System.out.println("Lay Eggs");

    }

    public void buildNest() {
        System.out.println("Build Nests");

    }

}
