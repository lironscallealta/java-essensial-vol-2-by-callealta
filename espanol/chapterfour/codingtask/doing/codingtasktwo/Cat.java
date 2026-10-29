package espanol.chapterfour.codingtask.doing.codingtasktwo;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("¡Miau! ¡Miau! ¡Miau!");
    }

    public void purr() {
        System.out.println("¡Ronroneando suavemente!");
    }

}