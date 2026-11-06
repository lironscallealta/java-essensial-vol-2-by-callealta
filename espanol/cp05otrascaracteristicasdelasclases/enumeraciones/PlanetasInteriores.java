package espanol.cp05otrascaracteristicasdelasclases.enumeraciones;

// Estas constantes son numeros int con nombres: MERCURIO vale 0, VENUS vale 1, etc.
// El for cambia i; el switch consulta su valor. case MERCURIO equivale aqui a case 0.
// break sale del switch, y el for continua con el siguiente valor.

public class PlanetasInteriores {

    public static final int MERCURIO = 0;
    public static final int VENUS = 1;
    public static final int TIERRA = 2;
    public static final int MARTE = 3;

    public static void main(String args[]) {

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case MERCURIO:
                    System.out.println("Mercurio");
                    break;
                case VENUS:
                    System.out.println("Venus");
                    break;
                case TIERRA:
                    System.out.println("Tierra");
                    break;
                case MARTE:
                    System.out.println("Mars");
                    break;
                default:
                    System.out.println("Otros planetas");

            }
        }
    }
}
