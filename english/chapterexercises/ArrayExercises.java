package english.chapterexercises;

// https://www.w3schools.com/java/java_arrays_reallife.asp
public class ArrayExercises {
    public static void main(String[] args) {
        averageAge();
        lowestAge();
        untilZero();
        maximumAndMinimum();
        seats();
    }

    private static void averageAge() {
        // 1. Loop through the ages and print their average with decimal precision.
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        // TODO
    }

    private static void lowestAge() {
        // 2. Find and print the youngest age.
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        // TODO
    }

    private static void untilZero() {
        // 3. Skip negative values with continue. Stop at the first zero with break. Print the values you process.
        int[] numbers = {3, -1, 7, 0, 9};
        // TODO
    }

    private static void maximumAndMinimum() {
        // 4. Find and print both the largest and smallest values in one pass.
        int[] numbers = {45, 12, 98, 33, 27};
        // TODO
    }

    private static void seats() {
        // 5. Print each seat index (starting at 0) and the name of its occupant.
        String[] occupants = {"Jenny", "Liam", "Angie", "Bo"};
        // TODO
    }
}
