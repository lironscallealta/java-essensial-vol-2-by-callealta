package espanol.cp06otrascaracteristicasdelasclases.palabrafinal;

public class LaPalabraFinal {

    // Constante de la clase: debe inicializarse y no puede reasignarse.
    public static final double IVA_VENTAS = 0.12;
}

/*
 * La palabra final tiene distintos efectos según dónde se use:
 *
 * - Una clase final no puede tener subclases. Por ejemplo, String es final,
 *   así que intentar extenderla produce un error de compilación:
 *
 *   class MiString extends String { } // Error.
 *
 *   Declarar una clase final impide que las subclases amplíen o cambien
 *   su comportamiento. String, además, está diseñada para ser inmutable.
 *
 * - Un método final puede heredarse y utilizarse, pero no sobrescribirse.
 *
 * - Un atributo final solo puede asignarse una vez. Debe recibir un valor
 *   en su declaración, en un inicializador o en un constructor.
 *   Si referencia un objeto, no se puede reasignar la referencia, aunque
 *   el contenido del objeto podría seguir siendo modificable.
 *
 * Un atributo static final suele utilizarse para una constante de la clase.
 */
