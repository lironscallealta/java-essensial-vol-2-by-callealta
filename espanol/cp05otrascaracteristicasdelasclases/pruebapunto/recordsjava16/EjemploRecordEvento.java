package espanol.cp05otrascaracteristicasdelasclases.pruebapunto.recordsjava16;

// El record agrupa un nombre y una fecha; Java genera el constructor y los metodos.
// LocalDate.of recibe anio, mes y dia. Dos eventos distintos con los mismos datos
// son iguales segun el equals() generado.

import java.time.LocalDate;

public class EjemploRecordEvento {

    record Evento(String nombre, LocalDate fecha) { }

    public static void main(String[] args) {

        Evento examen = new Evento("Examen de Java", LocalDate.of(2026, 11, 20));
        Evento mismoExamen = new Evento("Examen de Java", LocalDate.of(2026, 11, 20));

        System.out.println(examen.nombre()); 
        System.out.println(examen.fecha()); 

        System.out.println(examen); 

        System.out.println(examen.equals(mismoExamen)); 
    }
}
