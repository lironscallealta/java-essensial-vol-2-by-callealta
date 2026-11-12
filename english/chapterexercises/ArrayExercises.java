package english.chapterexercises;

import static java.lang.Math.incrementExact;

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

        int[] ages = { 20, 22, 18, 35, 48, 26, 87, 70 };
        // TODO
        System.out.println("exercise 1");
        float sum = 0, average, length = ages.length;
        for (int particulaAge : ages) {
            sum += particulaAge;
        }
        average = sum / length;
        System.out.println(average);

    }

    private static void lowestAge() {
        // 2. Find and print the youngest age.
        int[] ages = { 20, 22, 18, 35, 48, 26, 87, 70 };
        // TODO
        System.out.println("exercise 2");
        int lowest = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < lowest) {
                lowest = ages[i];
            }
        }
        System.out.println(lowest);
    }

    private static void untilZero() {
        // 3. Skip negative values with continue. Stop at the first zero with break.
        // Print the values you process.
        int[] numbers = { 3, -1, 7, 0, 9 };
        // TODO
        System.out.println("exercise 3");
        for (int i : numbers) {
            if (i < 0) {
                System.out.println("skip-number-minor-to-0");

                continue;
            } else if (i == 0) {
                System.out.println("finished number iqual to zero");
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }

    }

    private static void maximumAndMinimum() {
        // 4. Find and print both the largest and smallest values in one pass.
        int[] numbers = { 45, 12, 98, 33, 27 };
        // TODO
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i : numbers) {
            if (i > largest) {
                largest = i;
            }
            if (i < smallest) {
                smallest = i;

            }
        }
        System.out.println("The largest is " + largest);
        System.out.println("The smallest is " + smallest);
    }

    private static void seats() {
        // 5. Print each seat index (starting at 0) and the name of its occupant.
        String[] occupants = { "Jenny", "Liam", "Angie", "Bo" };
        // TODO
        for (int i = 0; i < occupants.length; i++) {
            System.out.println(i + 1 + "- " + occupants[i]);
        }
    }
}
