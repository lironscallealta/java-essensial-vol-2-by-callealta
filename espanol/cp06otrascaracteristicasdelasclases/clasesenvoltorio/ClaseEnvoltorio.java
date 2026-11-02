package espanol.cp06otrascaracteristicasdelasclases.clasesenvoltorio;

public class ClaseEnvoltorio {

    int numero = 100;
    Integer entero1 = numero; // Autoboxing: conversión automática de int a Integer.
    Integer entero2 = 200; // Autoboxing.
    int numero2 = entero2.intValue(); // Conversión explícita de Integer a int.

    // Es válido: Java convierte automáticamente ambos Integer a int (unboxing).
    int suma = entero1 + entero2;

    Integer cualquierNumero = Integer.valueOf(5); // También: Integer cualquierNumero = 5;
}
