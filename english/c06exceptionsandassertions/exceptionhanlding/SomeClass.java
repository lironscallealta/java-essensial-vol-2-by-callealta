package english.c06exceptionsandassertions.exceptionhanlding;

public class SomeClass {

    public static void main(String[] args) throws Exception {
        
        // unhandled exception will be thrown
        // here from line 16, this will cause
        // the abnormal termination of the program
        method1();
    }
    public static void method1() throws Exception {
        
        // unhandled exception object from
        // line 21 will be rethrown to line 10
        method2();    
    }
    public static void method2() throws Exception {
        
        // this line will throw the
        // Exception object to line 15
        throw new Exception();    
    }
}
