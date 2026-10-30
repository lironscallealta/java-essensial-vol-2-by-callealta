package english.cp05polymorphism.codingtask.doing.codingtaskone;

public class Test {

    public static void main(String[] args) {
        Student students[] = { new Student("Philips", "A123", 1000.2F),
                new Student("John", "C321", 2000.0F),
                new PartialScholar("Pedro", "C321", 3000.0F, 0.3F),
                new PartialScholar("Lucas", "C321", 3000.0F, 0.3F),
        };

        float totalCollection = 0.0F;

        for (int i = 0; i < students.length; i++) {
            System.out.println("--------");
            System.out.println(students[i]);
        }

        for(int i = 0; i < students.length; i++) {
            if (students[i] instanceof PartialScholar)
                totalCollection += ((PartialScholar)students[i]).getPayableAmount();
            else if (students[i] instanceof Student)
                totalCollection += students[i].getTuitionFee();
        }

        System.out.println("\nTotal Collectible Amount: " + totalCollection);
        System.out.println();

        System.out.println("Results with Descount:");

        for (int i = 0; i < students.length; i++) {
            if (students[i] instanceof Student) {
                System.out.println();
                
            }
        }

    }

}
