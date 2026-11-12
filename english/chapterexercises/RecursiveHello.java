package english.chapterexercises;

public class RecursiveHello {
    public static void main(String[] args) {
        repeatHello(3, "hello");
    }

    static void repeatHello(int times, String anyWord) {
        // BASE CASE: When no repetitions remain, stop.
        if (times == 0) {
            return;
        }

        // This call prints one greeting.
        int i = 0;
        System.out.println(anyWord);

        // Call this same method again with one fewer repetition.
        repeatHello(times - 1, anyWord);
    }
}
