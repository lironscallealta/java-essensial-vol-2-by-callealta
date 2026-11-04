package english.cp06otherclassfeatures.privatemethodsininterfaces;

public interface MyInterface {

    // A public abstract method
    void doSuff();

    //A static Method
    public static void doSomething(){
        System.out.println("inside do SomeThing...");
        logCommon(); //calling private helper method
    }
    //A default method
    default void doMore(){
        System.out.println("Inside doMore...");
        logCommon(); //calling private helper method
    }
    private static void logCommon(){
        System.out.println("[LOG] This is private " + "helper inside the interface.");
    }
}
