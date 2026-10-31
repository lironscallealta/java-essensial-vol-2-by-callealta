package espanol.cp05polimorfismo.tareasdecodificacion.desarrollo.tareauno;

public class Prueba {

    public static void main(String[] args) {
        Estudiante estudiantes[] = { new Estudiante("Philips", "A123", 1000.2F),
                new Estudiante("John", "C321", 2000.0F),
                new EstudianteBecadoParcial("Pedro", "C321", 3000.0F, 0.5F),
                new EstudianteBecadoParcial("Lucas", "C321", 3000.0F, 0.5F),
        };

        float montoTotalRecaudado = 0.0F;

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("--------");
            System.out.println(estudiantes[i]);
        }

        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] instanceof EstudianteBecadoParcial)
                montoTotalRecaudado += ((EstudianteBecadoParcial) estudiantes[i]).obtenerMontoPorPagar();
            else if (estudiantes[i] instanceof Estudiante)
                montoTotalRecaudado += estudiantes[i].obtenerArancel();
        }

        System.out.println("\nMonto total por cobrar: " + montoTotalRecaudado);
        System.out.println();

        System.out.println("Resultados con descuento:");
        System.out.println();

        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] instanceof EstudianteBecadoParcial) {
                EstudianteBecadoParcial partialScholar = (EstudianteBecadoParcial) estudiantes[i];
                System.out.println(partialScholar.toString());
                System.out.println("--> pago con descuento: " + partialScholar.obtenerMontoPorPagar());
                System.out.println();
            }
            else {
                
                System.out.println(estudiantes[i].toString());
            }
        }

    }

}
