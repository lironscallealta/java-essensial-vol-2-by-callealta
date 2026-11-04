package english.cp06otherclassfeatures.privatemethodsininterfaces;

public class StaticInterface implements MyInterface {

    @Override
    public void doSuff() {
        System.out.println("Inside doStuff...");
    }

    public static void main(String[] args) {
        StaticInterface si = new StaticInterface();
        si.doSuff();
        si.doMore(); //call default method
        MyInterface.doSomething(); //call static method
    }

}
