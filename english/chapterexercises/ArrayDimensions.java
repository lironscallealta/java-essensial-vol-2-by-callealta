package english.chapterexercises;

public class ArrayDimensions {
    public static void main(String[] args) {
        // 1D. Choose one position.
        int[] list = {10, 20, 30};

        // list[1] → second position → 20
        System.out.println(list[1]); // 20

        // 2D. Choose a row, then a position in that row.
        int[][] table = {{10, 20, 30}, {40, 50, 60}};

        // table[1] → second row
        // table[1][2] → third position in that row → 60
        System.out.println(table[1][2]); // 60

        // 3D. Choose a table, then a row, then a position.
        int[][][] tables = {{{10, 20}, {30, 40}}, {{50, 60}, {70, 80}}};

        // tables[1] → second table
        // tables[1][0] → first row of that table
        // tables[1][0][1] → second position in that row → 60
        System.out.println(tables[1][0][1]); // 60

        // 4D. Choose a group, then a table, a row, and a position.
        int[][][][] groups = {{{{10, 20}, {30, 40}}}, {{{50, 60}, {70, 80}}}};

        // groups[1] → second group
        // groups[1][0] → first table in that group
        // groups[1][0][1] → second row of that table
        // groups[1][0][1][0] → first position in that row → 70
        System.out.println(groups[1][0][1][0]); // 70

        // Follow the indices from left to right and predict the output.
        // System.out.println(table[0][2]);
        // System.out.println(tables[0][1][0]);
    }
}
