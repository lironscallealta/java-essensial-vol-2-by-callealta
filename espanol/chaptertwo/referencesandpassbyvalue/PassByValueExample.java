package espanol.chaptertwo.referencesandpassbyvalue;
/** Paso por valor: compara modificar un número, reasignar una referencia y cambiar un atributo. */
public class PassByValueExample {
    // Métodos para modificar los valores actuales.
    public static void changeInt(int value) {
        value = 55;
    }

    public static void changeObjectRef(Person ref) {
        ref = new Person("Walter", 30);
    }

    public static void changeObjectAttr(Person ref) {
        ref.setAge(30);
    }

    public static void main(String[] args) {
        Person per;
        int val;

        // Asigna el entero.
        val = 11;

        // Intenta modificarlo.
        changeInt(val);
       

        // ¿Cuál es el valor actual?
        System.out.println("El valor entero es: " + val);

        // Asigna la persona.
        per = new Person("Lawrence", 20);

        // Intenta modificarlo.
        changeObjectRef(per);

       

        // ¿Cuál es el valor actual?
        System.out.println("Persona: " + per);

        // Ahora modifica el atributo de edad
        // mediante la referencia al objeto.
        changeObjectAttr(per);

        // ¿Cuál es el valor actual?
        System.out.println("Persona: " + per);
    }
}
