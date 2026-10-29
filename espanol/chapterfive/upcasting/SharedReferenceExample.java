package espanol.chapterfive.upcasting;

public class SharedReferenceExample {

    public static void main(String[] args) {
        // 1. Crea UN objeto Manager y conserva una referencia Manager.
        Manager manager = new Manager();

        // setName() se hereda de Employee.
        manager.setName("Julian");

        // setDepartment() es específico de Manager.
        manager.setDepartment("Ventas");

        // 2. Apunta al MISMO objeto utilizando el tipo de su superclase.
        // Es una conversión ascendente implícita.
        // Aquí no aparece new: no se crea un segundo objeto.
        Employee employee = manager;

        // Ambas referencias apuntan al mismo objeto.
        System.out.println("Mismo objeto: " + (manager == employee)); // true

        // 3. Employee declara getDetails(), por lo que la llamada está permitida.
        // El objeto real es Manager, así que se ejecuta Manager.getDetails().
        System.out.println("Antes de actualizar: " + employee.getDetails());

        // 4. Modifica ese objeto mediante la referencia Manager.
        manager.setDepartment("Ingeniería");

        // La referencia Employee observa los datos actualizados del MISMO objeto.
        System.out.println("Después de actualizar: " + employee.getDetails());

        /*
 * El objeto y sus dos referencias:
 * manager  (tipo declarado: Manager)  ---+
 *                                       +---> UN objeto Manager
 * employee (tipo declarado: Employee) ---+
 * 
 * Usa manager para los métodos específicos de Manager.
 * Usa employee para trabajar con las operaciones comunes de Employee.
 * NO VÁLIDO:
 * employee.setDepartment("Finanzas");
 * Employee no declara ni hereda setDepartment(). La conversión ascendente
 * no agrega los métodos específicos de Manager a Employee.
 * 
 * SALIDA ESPERADA:
 * Mismo objeto: true
 * Antes de actualizar: Nombre: Julian - Departamento: Ventas
 * Después de actualizar: Nombre: Julian - Departamento: Ingeniería
 */
    }
}
