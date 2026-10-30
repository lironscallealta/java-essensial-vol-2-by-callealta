package english.cp05polymorphism.codingtask.assignment.codingtaskone;

public class Assignment {

    /*
     * Coding Task 1: Student Scholarship
     *
     * You are hired by your University to create an application that will manage
     * student records and their scholarship and tuition fee information.
     *
     * Set up a hierarchy with two Java classes: Student represents a regular paying
     * student; PartialScholar is a subclass of Student with a tuition fee discount.
     * The scholarship percentage may vary and is sponsored by a scholarship provider.
     * Given the UML, create the respective classes, attributes, constructors and methods.
     *
     * UML (- means private, + means public; counter is static):
     *
     * Student
     * - name: String
     * - course: String
     * - tuitionFee: float
     * - studentNumber: int
     * - counter: int [static]
     * + Student(String name, String course, float tuitionFee)
     * // getters()
     * // toString()
     *
     * PartialScholar extends Student
     * - discountRate: float
     * - payableAmount: float
     * + PartialScholar(String name, String course, float tuitionFee, float discountRate)
     * // getters()
     * // toString()
     *
     * The Student constructor accepts the student's name, course and tuitionFee.
     * Create a static counter and a non-static studentNumber. Use them to compute
     * the student number for each created student and return it in toString().
     *
     * The PartialScholar constructor accepts name, course, tuitionFee and discountRate.
     * Reuse the Student constructor, passing name, course and tuitionFee.
     * In the PartialScholar constructor, compute payableAmount by deducting the
     * product of tuitionFee and discountRate from tuitionFee.
     *
     * Override toString() in both classes. Refer to the sample output below.
     * The supplied TestStudent code must not be edited (except its project package).
     *
     * Provided test class:
     *
     * public class TestStudent {
     *     public static void main(String args[]) {
     *         Student students[] = {
     *             new Student("Mathew", "BSCS", 10000.0F),
     *             new Student("Mark", "BSIT", 12000.0F),
     *             new PartialScholar("Luke", "BSIT", 12000.0F, 0.25F),
     *             new PartialScholar("John", "BSIT", 11000.0F, 0.5F),
     *         };
     *
     *         float totalCollection = 0.0F;
     *
     *         for (int i = 0; i < students.length; i++) {
     *             System.out.println(students[i]);
     *         }
     *
     *         // compute totalCollection value
     *         for (int i = 0; i < students.length; i++) {
     *             if (students[i] instanceof PartialScholar)
     *                 totalCollection += ((PartialScholar) students[i]).getPayableAmount();
     *             else if (students[i] instanceof Student)
     *                 totalCollection += students[i].getTuitionFee();
     *         }
     *
     *         System.out.println("\nTotal Collectible Amount: " + totalCollection);
     *     }
     * }
     *
     * Sample runtime output:
     *
     * Student # 1: Mathew is taking up BSCS with a tuition fee of 10000.0
     *
     * Student # 2: Mark is taking up BSIT with a tuition fee of 12000.0
     *
     * Student # 3: Luke is taking up BSIT with a tuition fee of 12000.0
     * Discount Rate of: 25%
     * Net Payable Tuition Fee is: 9000.0
     *
     * Student # 4: John is taking up BSIT with a tuition fee of 11000.0
     * Discount Rate of: 50%
     * Net Payable Tuition Fee is: 5500.0
     *
     * Total Collectible Amount: 36500.0
     */
}
