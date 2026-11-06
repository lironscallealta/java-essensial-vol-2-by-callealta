package english.cp05otherclassfeatures.defaultinterface.defaultmethod;

interface MyInterface {
    public void sayHi();

    default void myDefaultGreeting() {
        System.out.println("Hello default world.");
    }

}

public class DefaultInterface implements MyInterface {

    @Override
    public void sayHi() {
        System.out.println("Hi");
    }

    @Override
    public void myDefaultGreeting() {
        MyInterface.super.myDefaultGreeting();
        System.out.println("Overriding default method.");
    }

    public static void main(String[] args) {
        MyInterface di = new DefaultInterface(); 
        di.sayHi();
        di.myDefaultGreeting();            
    }

}