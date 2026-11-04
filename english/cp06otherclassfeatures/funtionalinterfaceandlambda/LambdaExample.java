package english.cp06otherclassfeatures.funtionalinterfaceandlambda;

// LambdaExample.java

@FunctionalInterface
interface Greeter {
    public void sayHello(String name);
}

public class LambdaExample {

    public static void main(String args[]) {
        Greeter g = (name) -> System.out.println("Hello " + name);
        g.sayHello("Pello");
    }
}