package english.chapterexercises;

public class RecursiveHello {
    public static void main(String[] args) {
        repeatHello(3);
    }

    static void repeatHello(int times) {
        // BASE CASE: When no repetitions remain, stop.
        if (times == 0) {
            return;
        }

        // This call prints one greeting.
        System.out.println("Hello");

        // Call this same method again with one fewer repetition.
        repeatHello(times - 1);
    }
}
