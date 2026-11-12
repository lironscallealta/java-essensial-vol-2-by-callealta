package english.chapterexercises;

public class RecursiveCountdown {
    public static void main(String[] args) {
        countDown(3);
    }

    static void countDown(int number) {
        // BASE CASE: Stop when the number reaches zero.
        if (number == 0) {
            System.out.println("Finished!");
            return;
        }

        // Print the current number.
        System.out.println(number);

        // Call this same method again with a smaller number.
        countDown(number - 1);
    }
}
