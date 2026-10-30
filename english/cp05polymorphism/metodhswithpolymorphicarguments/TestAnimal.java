package english.cp05polymorphism.metodhswithpolymorphicarguments;

public class TestAnimal {

    public static void main(String[] args) {
        Mammal dog = new Mammal();
        Bird eagle = new Bird();

        System.out.println("-------");
        System.out.println("Test dog");
        System.out.println("-------");
        doAnimalStuff(dog);

         System.out.println("-------");
        System.out.println("Test eagle");
        System.out.println("-------");
        doAnimalStuff(eagle);

    }

    public static void doAnimalStuff(Animal a) {

        a.eat();
        a.beathe();
        a.sleep();
        a.play();

        if (a instanceof Mammal) {

            Mammal m = (Mammal) a;
            m.feedYoung();

        }
        else if (a instanceof Bird) {

            Bird b = (Bird) a;
            b.layEggs();;
            b.buildNest();
            
        }

    }

}
