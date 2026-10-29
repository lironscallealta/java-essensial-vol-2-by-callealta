package espanol.chapterfour.codingtask.doing.codingtasktwo;

public class TestAnimal {

    public static void main(String[] args) {

        Dog myDog = new Dog("Buddy", 3);
        Cat myCat = new Cat("Whiskers", 2);

        myDog.displayInfo();
        myDog.makeSound();
        myDog.fetch();
        myCat.displayInfo();
        myCat.makeSound();
        myCat.purr();

    }

}
