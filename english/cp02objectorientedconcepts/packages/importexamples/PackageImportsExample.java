package english.cp02objectorientedconcepts.packages.importexamples;

// TOPIC: packages and imports. Start reading the example in this file.
// See ../README.md for the purpose of each folder.
// Wildcard import: lets you use public classes from suba by their simple names.
// It does not include classes from the subaa subpackage.
import english.cp02objectorientedconcepts.packages.suba.*;
// Explicit import: lets you use class AA from a subpackage.
import english.cp02objectorientedconcepts.packages.suba.subaa.AA;
// Alternative for B: uncomment this import and use B instead of its fully qualified name.
// import english.cp02objectorientedconcepts.packages.subb.B;
import english.cp02objectorientedconcepts.packages.subc.*;

/**
 * Runnable example for practicing packages and imports.
 * Classes A, AA, B, and C have empty methods, so running it produces no output.
 * The goal is to see how to use classes that belong to different packages.
 */
public class PackageImportsExample {

    public static void main(String[] args) {

        A a = new A();
        AA aa = new AA();
        C c = new C();
        // Fully qualified name: B can be used without adding an import.
        english.cp02objectorientedconcepts.packages.subb.B b = new english.cp02objectorientedconcepts.packages.subb.B();
        a.printMe();
        aa.printMe();
        b.printMe();
        c.printMe();

    }

}
