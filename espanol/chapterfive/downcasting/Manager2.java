package espanol.chapterfive.downcasting;

public class Manager2 extends Employee2 {

    String department;

    @Override
    public String getDetails() {
        return super.getDetails()
                + "\nDepartamento: " + department;
    }

    public void callMeeting() {
        System.out.println("Convocar reunión de departamento..");
    }
    
}
