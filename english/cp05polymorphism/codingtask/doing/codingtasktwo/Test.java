package english.cp05polymorphism.codingtask.doing.codingtasktwo;
public class Test {

    public static void main(String[] args) {
        Animal animals[] = {
                new Dog(),
                new Cat(),
                new Bird()
        };


        for (int i = 0; i < animals.length; i++) {
           AnimalKingdom.printAnimal(animals[i]);
           animals[i].move();
        }
    }



}
