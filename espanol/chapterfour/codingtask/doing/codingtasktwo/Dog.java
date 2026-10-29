package espanol.chapterfour.codingtask.doing.codingtasktwo;

public class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("¡Guau! ¡Guau! ¡Guau!");
    }

    public void fetch() {
        System.out.println("¡Buscando la pelota!");
    }
}
