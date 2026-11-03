package espanol.cp06otrascaracteristicasdelasclases.enumeraciones;

// Otros conjuntos fijos de opciones: colores del semaforo, dias, meses y direcciones.
// Cada enum define su propio tipo. Las mayusculas son una convencion para las constantes.

public class MasEjemplos {

    enum Semaforo {
        ROJO, AMARILLO, VERDE
    }

    enum Dia {
        LUNES, MARTES, MIERCOLES,

        JUEVES, VIERNES, SABADO, DOMINGO
    }

    enum Mes {
        ENERO, FEBRERO, MARZO,

        ABRIL, MAYO, JUNIO,

        JULIO, AGOSTO, SEPTIEMBRE,

        OCTUBRE, NOVIEMBRE, DICIEMBRE
    }

    enum Direccion {
        NORTE, SUR, ESTE, OESTE
    }

}
