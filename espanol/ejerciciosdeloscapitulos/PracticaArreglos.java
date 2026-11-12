package espanol.ejerciciosdeloscapitulos;

public class PracticaArreglos {
    public static void main(String[] args) {
        // 1D. Elige una posición.
        int[] lista = {10, 20, 30};

        // lista[1] → segunda posición → 20
        System.out.println(lista[1]); // 20

        // 2D. Elige una fila y luego una posición en esa fila.
        int[][] tabla = {{10, 20, 30}, {40, 50, 60}};

        // tabla[1] → segunda fila
        // tabla[1][2] → tercera posición de esa fila → 60
        System.out.println(tabla[1][2]); // 60

        // 3D. Elige una tabla, una fila y una posición.
        int[][][] tablas = {{{10, 20}, {30, 40}}, {{50, 60}, {70, 80}}};

        // tablas[1] → segunda tabla
        // tablas[1][0] → primera fila de esa tabla
        // tablas[1][0][1] → segunda posición de esa fila → 60
        System.out.println(tablas[1][0][1]); // 60

        // 4D. Elige un grupo, una tabla, una fila y una posición.
        int[][][][] grupos = {{{{10, 20}, {30, 40}}}, {{{50, 60}, {70, 80}}}};

        // grupos[1] → segundo grupo
        // grupos[1][0] → primera tabla de ese grupo
        // grupos[1][0][1] → segunda fila de esa tabla
        // grupos[1][0][1][0] → primera posición de esa fila → 70
        System.out.println(grupos[1][0][1][0]); // 70

        // Sigue los índices de izquierda a derecha y predice qué se imprime.
        // System.out.println(tabla[0][2]);
        // System.out.println(tablas[0][1][0]);
    }
}
