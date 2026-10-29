package espanol.chaptertwo.codingtask.doing.codingtaskone;

/** Ejercicio en curso: consulta el enunciado en assignment/codingtaskone desde la carpeta codingtask. */
public class CodingTask {
    /*
 * Objetivo: escribir un programa Java que demuestre el uso de tipos primitivos,
 * tipos de referencia, clases propias, asignación de referencias, paso por valor,
 * alcance de variables locales y la referencia this.
 */

    /*
 * REQUISITOS:
 * 1. Crea Person con los atributos String name e int age y estos miembros:
 * - Un constructor que reciba name y age e inicialice los atributos.
 * - updateAge(): recibe un objeto Person y un int para actualizar su edad.
 * - incrementAge(): incrementa la edad y devuelve la persona actualizada.
 * - displayInfo(): imprime el nombre y la edad.
 * 
 * 2. Programa principal:
 * Crea Person e inicializa nombre y edad mediante el constructor.
 * Pasa el objeto a updateAge() para actualizar su edad.
 * Usa incrementAge() y asigna el resultado a una nueva variable de referencia.
 * Demuestra el efecto de cambiar la referencia y del alcance de variables locales.
 * Usa this dentro de Person para reutilizar métodos.
 */

    public static void main(String[] args) {

        PersonFour p1 = new PersonFour("Nombre cualquiera", 25);
        System.out.println("edad actual");
        p1.displayInfo();

        System.out.println();
        System.out.println("actualizando la edad");
        p1.updateAge(p1, 30);
        p1.displayInfo();

        // PersonFour newPersonOlder = new PersonFour(p1); // Esta línea no es necesaria.
        System.out.println();
        System.out.println("incrementar la edad");
        PersonFour newPersonOlder = p1.incrementAge(4);
        newPersonOlder.displayInfo();

    }

}

class PersonFour {
    public String name;
    public int age;

    PersonFour(String name, int age) {
        this.name = name;
        this.age = age;

    }

    PersonFour(PersonFour per) {
        this.name = per.name;
        this.age = per.age;

    }

    public void updateAge(PersonFour person, int updateAge) {

        person.age = updateAge;

    }

    public PersonFour incrementAge(int increseAge) {

        PersonFour newPerson = new PersonFour(this);
        newPerson.age += increseAge;
        return newPerson;

    }

    public void displayInfo() {
        System.out
                .println(
                        "Nombre de la persona: " + this.name + ". Edad de la persona: " + this.age + " Hash del objeto: " + this);
    }
}
