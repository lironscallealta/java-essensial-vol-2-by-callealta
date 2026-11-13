package espanol.ejerciciosdeloscapitulos;

public class ConstruccionArreglosMultidimensionales {
    public static void main(String[] args) {
        // 1. CONSTRUYE CUATRO FILAS DE ASIENTOS
        // Cada número identifica un asiento del cine.
        // filaA → 10, 11
        // filaB → 20, 21
        // filaC → 30, 31
        // filaD → 40, 41
        // Declara un int[] por fila. Escribe cada arreglo en una línea.
        // Las cuatro filas también se pueden agrupar en una sola tabla.
        int[] filaA = {10, 11};
        int[] filaB = {20, 21};
        int[] filaC = {30, 31};
        int[] filaD = {40, 41};
        int[][] todasLasFilas = {filaA, filaB, filaC, filaD};
        int[][] filasDirectas = {{10, 11}, {20, 21}, {30, 31}, {40, 41}};
        System.out.println(todasLasFilas[3][1]);
        System.out.println(filasDirectas[3][0]);

        // 2. CONSTRUYE DOS SALAS
        // sala0 contiene filaA y filaB.
        // sala1 contiene filaC y filaD.
        // Declara ambas salas como int[][] y reutiliza las filas del paso 1.
        // TODO


        // 3. CONSTRUYE EL CINE
        // Declara un int[][][] llamado cine que contenga sala0 y sala1.
        // Imprime cuántas salas hay y cuántas filas tiene cada una.
        // La salida debe mostrar 2 salas con 2 filas cada una.
        // TODO

        // 4. ESCRIBE EL MISMO CINE EN UNA LÍNEA
        // Declara otro int[][][] llamado cineDirecto.
        // Escribe los números y las llaves directamente en una línea.
        // Mantén las mismas filas agrupadas en cada sala.
        // TODO

        // 5. DESAFÍO. DISEÑA OTRO CINE
        // Crea un int[][][] con dos salas y cuatro filas en total.
        // Pon una fila en la primera sala y tres en la segunda.
        // Inventa números de asiento y escribe el arreglo en una línea.
        // Imprime la cantidad de filas por sala. Debes ver 1 y 3.
        // TODO
    }
}
