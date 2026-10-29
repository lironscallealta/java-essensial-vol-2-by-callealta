package espanol.cp05polimorfismo.conversionascendente;

public class EjemploReferenciaCompartida {

    public static void main(String[] argumentos) {
        // 1. Crea UN objeto Gerente y conserva una referencia Gerente.
        Gerente gerente = new Gerente();

        // establecerNombre() se hereda de Empleado.
        gerente.establecerNombre("Julian");

        // establecerDepartamento() es específico de Gerente.
        gerente.establecerDepartamento("Ventas");

        // 2. Apunta al MISMO objeto utilizando el tipo de su superclase.
        // Es una conversión ascendente implícita.
        // Aquí no aparece new: no se crea un segundo objeto.
        Empleado empleado = gerente;

        // Ambas referencias apuntan al mismo objeto.
        System.out.println("Mismo objeto: " + (gerente == empleado)); // true

        // 3. Empleado declara obtenerDetalles(), por lo que la llamada está permitida.
        // El objeto real es Gerente, así que se ejecuta Gerente.obtenerDetalles().
        System.out.println("Antes de actualizar: " + empleado.obtenerDetalles());

        // 4. Modifica ese objeto mediante la referencia Gerente.
        gerente.establecerDepartamento("Ingeniería");

        // La referencia Empleado observa los datos actualizados del MISMO objeto.
        System.out.println("Después de actualizar: " + empleado.obtenerDetalles());

        /*
 * El objeto y sus dos referencias:
 * gerente  (tipo declarado: Gerente)  ---+
 *                                       +---> UN objeto Gerente
 * empleado (tipo declarado: Empleado) ---+
 * 
 * Usa gerente para los métodos específicos de Gerente.
 * Usa empleado para trabajar con las operaciones comunes de Empleado.
 * NO VÁLIDO:
 * empleado.establecerDepartamento("Finanzas");
 * Empleado no declara ni hereda establecerDepartamento(). La conversión ascendente
 * no agrega los métodos específicos de Gerente a Empleado.
 * 
 * SALIDA ESPERADA:
 * Mismo objeto: true
 * Antes de actualizar: Nombre: Julian - Departamento: Ventas
 * Después de actualizar: Nombre: Julian - Departamento: Ingeniería
 */
    }
}
