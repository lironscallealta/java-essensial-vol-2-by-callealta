package english.cp00bridgetovolume2;

public class TernaryPractice {
    public static void main(String[] args) {
        int hour = 15;

        // With hour = 15, is 15 < 12? No. Java goes to the branch after the first ':'.
        // Is 15 < 18? Yes. Java chooses the value after the second '?'.
        String greeting = (hour < 12)
                ? "Good morning"
                : ((hour < 18) ? "Good afternoon" : "Good evening");
        System.out.println(greeting); // Good afternoon

        // The same decision with if, else if, and else.
        String greetingWithIf;
        if (hour < 12) {
            greetingWithIf = "Good morning";
        } else if (hour < 18) {
            greetingWithIf = "Good afternoon";
        } else {
            greetingWithIf = "Good evening";
        }
        System.out.println(greetingWithIf); // Good afternoon

        int number = 0;

        // With number = 0, number < 0 is false, so Java checks number == 0.
        // The second condition is true, so Java chooses "Zero".
        String type = (number < 0)
                ? "Negative"
                : ((number == 0) ? "Zero" : "Positive");
        System.out.println(type); // Zero

        // Try hour = 9. Does Java reach the second condition?
        // Try hour = 18. Which greeting does Java choose?
    }
}
