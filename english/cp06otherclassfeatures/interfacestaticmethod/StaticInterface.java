package english.cp06otherclassfeatures.interfacestaticmethod;

public class StaticInterface implements MyInterface {

    @Override
    public void doStuff() {
        System.out.println("Inside doStuff...");
    }

    public static void main(String[] args) {
        StaticInterface si = new StaticInterface();

        // Call the instance method through an object.
        si.doStuff();

        // Call the static method through the interface name.
        // It belongs to MyInterface, not to StaticInterface.
        MyInterface.doSomething();
    }
}