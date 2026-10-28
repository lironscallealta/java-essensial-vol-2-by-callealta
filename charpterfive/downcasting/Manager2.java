package charpterfive.downcasting;

public class Manager2 extends Employee2 {

    String department;

    @Override
    public String getDetails() {
        return super.getDetails()
                + "\nDepartment: " + department;
    }

    public void callMeeting() {
        System.out.println("Call Department Meeting..");
    }
    
}
