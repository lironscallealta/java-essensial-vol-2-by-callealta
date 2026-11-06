package english.cp05otherclassfeatures.interfacestaticmethod;

public interface MyInterface {

    // This is an instance method.
    // A class that implements MyInterface must provide its implementation.
    public void doStuff();

    // This method is static and belongs to MyInterface.
    // The interface itself is not static; only this method is.
    // Call it with MyInterface.doSomething().
    public static void doSomething() {
        System.out.println("Inside doSomething...");
    }
}