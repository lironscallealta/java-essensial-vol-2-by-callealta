package espanol.cp04herenciasobrecargayconstructores.sobrescrituradeobject;



public class PruebaPersona {

    public static void main(String[] argumentos) {
        Persona persona1 = new Persona("Lawrence", 30);
        Persona persona2 = new Persona("Lawrence", 30);

        System.out.println(persona1 == persona2);
        System.out.println(persona1.equals(persona2));

        System.out.println(persona1.hashCode());
        System.out.println(persona2.hashCode());

        System.out.println(persona1);
        System.out.println(persona2.toString());
    }
}