package espanol.cp00puentealvolumen2;

public class PermisosDeArchivo {
    public static void main(String[] args) {
        // PASO 1: Cada permiso ocupa una posición de bit distinta.
        // Posición:  8  4  2  1
        // LEER:      0  0  0  1
        // ESCRIBIR:  0  0  1  0
        // EJECUTAR:  0  1  0  0
        // El 1 marca la posición del permiso. En Java, 0b inicia
        // un número binario.
        final int LEER = 0b0001;
        final int ESCRIBIR = 0b0010;
        final int EJECUTAR = 0b0100;

        // PASO 2: Ana tiene ESCRIBIR y EJECUTAR.
        // | combina esos permisos:
        //   ESCRIBIR:  0010
        //   EJECUTAR:  0100
        //              ----
        //   Ana tiene: 0110
        // LEER no está incluido.
        int permisosDeAna = ESCRIBIR | EJECUTAR;

        // PASO 3: Preguntamos si Ana puede LEER.
        // Regla general para una columna:
        //   1 & 1 da 1
        //   1 & 0 da 0
        //   0 & 1 da 0
        //   0 & 0 da 0
        // Esta regla se aplica a cada columna. Solo aparece una pareja
        // de unos si ambos números tienen un 1 en la misma posición.
        //
        // Comparamos el 0110 de Ana con el 0001 de LEER:
        // Posición:           8  4  2  1
        // Permisos de Ana:    0  1  1  0
        // LEER:               0  0  0  1
        //                     ---------
        // Parejas:            0&0 1&0 1&0 0&1
        // Resultado:            0   0   0   0
        // Aquí no hay pareja 1&1, porque los unos están en posiciones
        // distintas. El resultado 0000 vale 0 en decimal.
        int coincidenciaLectura = permisosDeAna & LEER;

        // != significa "distinto de". Pregunta si coincidenciaLectura
        // es diferente de 0. Vale 0, así que la condición es false
        // y se ejecuta el bloque else.
        if (coincidenciaLectura != 0) {
            System.out.println("Ana puede leer el archivo");
        } else {
            System.out.println("Ana no puede leer el archivo");
        }

        // PASO 4: Preguntamos si Ana puede ESCRIBIR.
        // Comparamos el 0110 de Ana con el 0010 de ESCRIBIR:
        // Posición:           8  4  2  1
        // Permisos de Ana:    0  1  1  0
        // ESCRIBIR:           0  0  1  0
        //                     ---------
        // Parejas:            0&0 1&0 1&1 0&0
        // Resultado:            0   0   1   0
        // Esta vez ambos tienen un 1 en la posición que vale 2.
        // El resultado 0010 vale 2 y es distinto de 0.
        int coincidenciaEscritura = permisosDeAna & ESCRIBIR;
        if (coincidenciaEscritura != 0) {
            System.out.println("Ana puede guardar cambios");
        } else {
            System.out.println("Ana no puede guardar cambios");
        }

        // PASO 5: Preguntamos si Ana puede EJECUTAR.
        // Comparamos el 0110 de Ana con el 0100 de EJECUTAR:
        // Posición:           8  4  2  1
        // Permisos de Ana:    0  1  1  0
        // EJECUTAR:           0  1  0  0
        //                     ---------
        // Parejas:            0&0 1&1 1&0 0&0
        // Resultado:            0   1   0   0
        // Ambos tienen un 1 en la posición que vale 4.
        // El resultado 0100 vale 4 y es distinto de 0.
        int coincidenciaEjecucion = permisosDeAna & EJECUTAR;
        if (coincidenciaEjecucion != 0) {
            System.out.println("Ana puede ejecutar el archivo");
        } else {
            System.out.println("Ana no puede ejecutar el archivo");
        }

        // SALIDA:
        // Ana no puede leer el archivo
        // Ana puede guardar cambios
        // Ana puede ejecutar el archivo
        //
        // RESUMEN:
        // | combina permisos y los guarda juntos.
        // & compara los permisos guardados con un permiso.
        // Si el resultado es distinto de 0, al menos un bit coincidió.
        // Aquí cada permiso usa un solo bit, así que esa coincidencia
        // significa que el permiso está activado.
    }
}
