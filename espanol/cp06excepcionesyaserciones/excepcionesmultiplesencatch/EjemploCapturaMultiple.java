package espanol.cp06excepcionesyaserciones.excepcionesmultiplesencatch;

/*
 * Antes de Java SE 7 se usaban bloques catch separados para IOException y SQLException. Con un catch múltiple se puede compartir el manejador.
 *
 * try {
 *     // Código que puede lanzar una excepción.
 * } catch (IOException | SQLException ex) {
 *     registrarProblema(ex);
 * }
 */

import java.io.IOException;
import java.sql.SQLException;

public class EjemploCapturaMultiple {

    public static void main(String[] args) {
        capturarPorSeparado();
        capturarJuntas();
    }

    private static void capturarPorSeparado() {
        // Antes de Java SE 7, cada tipo de excepción requería un catch propio.
        try {
            realizarOperacion(false);
        } catch (IOException ex) {
            registrarProblema(ex);
        } catch (SQLException ex) {
            registrarProblema(ex);
        }
    }

    private static void capturarJuntas() {
        // Desde Java SE 7, varios tipos de excepción pueden
        // compartir un bloque catch. Separa los tipos con |.
        try {
            realizarOperacion(true);
            // En un catch múltiple, | separa los tipos de excepción
            // que puede capturar el bloque.
        } catch (IOException | SQLException ex) {
            // El mismo bloque maneja cualquiera de las dos excepciones.
            registrarProblema(ex);
        }
    }

    private static void realizarOperacion(boolean simularErrorDeBaseDeDatos)
            throws IOException, SQLException {
        // Simula ambos tipos de fallo para ejecutar el ejemplo por sí solo.
        if (simularErrorDeBaseDeDatos) {
            throw new SQLException("No se pudo consultar la base de datos.");
        }

        throw new IOException("No se pudo leer el archivo.");
    }

    private static void registrarProblema(Exception ex) {
        System.err.println(ex.getClass().getSimpleName() + ": " + ex.getMessage());
    }
}
