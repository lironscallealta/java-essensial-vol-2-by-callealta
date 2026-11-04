package english.cp06otherclassfeatures.funtionalinterfaceandlambda;

// LambdaExample.java

@FunctionalInterface
interface Greeter {
    public void sayHello(String name);
}

public class LambdaExample {

    public static void main(String args[]) {
        // example 1
        Greeter g = (name) -> System.out.println("Hello " + name);
        g.sayHello("Pello");

        // example 2
        Greeter g2 = (name) -> {
            System.out.print("Hello ");

            System.out.println(name);
        };

        g2.sayHello("Lawrence");

    }
}