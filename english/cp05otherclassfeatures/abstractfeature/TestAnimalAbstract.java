package english.cp05otherclassfeatures.abstractfeature;

public class TestAnimalAbstract {

    public static void main(String[] args) {

        // cannot instantiate an object
        // from an abstract class
        //! Animal a = new Animal();

        Mammal dog = new Mammal();
        Bird eagle = new Bird();

        doAnimalStuff(dog);
        doAnimalStuff(eagle);
    }

    public static void doAnimalStuff(Animal a) {

        if (a instanceof Mammal) {
            Mammal m = (Mammal) a;

            m.eat(); // redundancy
            m.breathe(); // redundancy
            m.sleep(); // redundancy
            m.play(); // redundancy
            m.feedYoung();
        } else if (a instanceof Bird b) {

            b.eat(); // redundancy
            b.breathe(); // redundancy
            b.sleep(); // redundancy
            b.play(); // redundancy
            b.layEggs();
            b.buildNest();
        }
    }
}