package english.cp06otherclassfeatures.testpoint.recordFeatureJava16;

import java.time.LocalDate;

public class EventRecordExample {

    // Groups a name and a date; Java generates the constructor and methods.
    record Event(String name, LocalDate date) { }

    public static void main(String[] args) {

        // LocalDate.of receives year, month, and day.
        Event exam = new Event("Java exam", LocalDate.of(2026, 11, 20));
        Event sameExam = new Event("Java exam", LocalDate.of(2026, 11, 20));

        System.out.println(exam.name()); // Java exam
        System.out.println(exam.date()); // 2026-11-20

        System.out.println(exam); // Event[name=Java exam, date=2026-11-20]

        // Separate objects with matching component values.
        System.out.println(exam.equals(sameExam)); // true
    }
}