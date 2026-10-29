package espanol.cp02variablesreferenciasyconstructores.constructores;
/** Constructor de copia: usar PersonaDos.agregarEdad() para crear otro objeto. */
public class EjemploConstructorDeCopia {

    public static void main(String[] argumentos) {
        PersonaDos persona1 = new PersonaDos("Lawrence", 20);
        PersonaDos personaMayor = persona1.agregarEdad(10);

        System.out.println(personaMayor);
    }
}



