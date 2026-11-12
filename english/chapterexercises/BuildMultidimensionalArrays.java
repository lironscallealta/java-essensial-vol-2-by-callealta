package english.chapterexercises;

public class BuildMultidimensionalArrays {
    public static void main(String[] args) {
        // 1. BUILD FOUR ROWS OF SEATS
        // Each number identifies a seat in a movie theater.
        // rowA → 10, 11
        // rowB → 20, 21
        // rowC → 30, 31
        // rowD → 40, 41
        // Declare one int[] per row. Write each array on a single line.
        // TODO
        int a[] = {10,11} ;
        int b [] = {20, 21};
        int c [] = {30, 31};
        int d [] = {40 , 41};
        int allRows [][] = {a,b,c,d};
        int allRows2 [][] = {{10,11},{20,21},{30,31},{40,41}};
        System.out.println(allRows[3][1]);
        System.out.println(allRows2[3][0]);

        // 2. BUILD TWO SCREENING ROOMS
        // room0 contains rowA and rowB.
        // room1 contains rowC and rowD.
        // Declare both rooms as int[][] and reuse the rows from step 1.
        // TODO
        

        // 3. BUILD THE THEATER
        // Declare an int[][][] named theater that contains room0 and room1.
        // Print the number of rooms, then the number of rows in each room.
        // The output should show 2 rooms with 2 rows each.
        // TODO

        // 4. WRITE THE SAME THEATER ON ONE LINE
        // Declare another int[][][] named theaterDirect.
        // Write the seat numbers and braces directly on one line.
        // Keep the same rows grouped together in each room.
        // TODO

        // 5. CHALLENGE: DESIGN A DIFFERENT THEATER
        // Create an int[][][] with two rooms and four rows in total.
        // Put one row in the first room and three rows in the second.
        // Invent your own seat numbers and write the array on one line.
        // Print the number of rows in each room. You should see 1 and 3.
        // TODO
    }
}
