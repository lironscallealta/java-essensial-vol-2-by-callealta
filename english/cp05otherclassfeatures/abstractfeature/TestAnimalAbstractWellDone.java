package english.cp05otherclassfeatures.abstractfeature;

// TestAnimalAbstractWellDone.java

public class TestAnimalAbstractWellDone {

    public static void main(String[] args) {
        Mammal dog = new Mammal();
        Bird eagle = new Bird();

        doAnimalStuff(dog);
        doAnimalStuff(eagle);
    }

    public static void doAnimalStuff(Animal a) {
        a.eat();
        a.breathe();
        a.sleep();
        a.play();

        if (a instanceof Mammal m) {
            m.feedYoung();
        } else if (a instanceof Bird b) {
            b.layEggs();
            b.buildNest();
        }
    }
}