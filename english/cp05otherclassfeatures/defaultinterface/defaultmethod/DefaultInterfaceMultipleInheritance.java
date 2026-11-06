package english.cp05otherclassfeatures.defaultinterface.defaultmethod;

interface MyInterface1 {

    public default void myDefaultGreeting() {
        System.out.println("Inside MyInterface 1");
    }
}

interface MyInterface2 {

    public default void myDefaultGreeting() {
        System.out.println("Inside MyInterface 2");
    }
}

public class DefaultInterfaceMultipleInheritance
        implements MyInterface1, MyInterface2 {

    // Both interfaces provide a default method with the same name and
    // signature. Java cannot choose which implementation to use, so this
    // class must override the method and decide what it should do.
    @Override
    public void myDefaultGreeting() {

        // Call the implementation from MyInterface1.
        MyInterface1.super.myDefaultGreeting();

        // Call the implementation from MyInterface2.
        MyInterface2.super.myDefaultGreeting();

        System.out.println("Overriding the default method.");
    }

    public static void main(String[] args) {
        DefaultInterfaceMultipleInheritance di = new DefaultInterfaceMultipleInheritance();

        di.myDefaultGreeting();
    }
}