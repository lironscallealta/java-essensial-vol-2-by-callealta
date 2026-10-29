package espanol.chapterfour.codingtask.doing.codingtasktwo;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void makeSound() {
        System.out.println("Sonido genérico de animal");
    }

    public void displayInfo() {
        System.out.println("Nombre: " + name + " Edad: " + age);
    }

}
