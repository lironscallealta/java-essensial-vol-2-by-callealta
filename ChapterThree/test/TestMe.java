package ChapterThree.test;

//how to packaging
import ChapterThree.subA.*; //for all classes inside this package
import ChapterThree.subA.subAA.AA; //specific class
//import ChapterThree.subB.B; //specific class
import ChapterThree.subC.*;

public class TestMe {

    public static void main(String[] args) {

        A a = new A();
        AA aa = new AA();
        C c = new C();
        // fully-qualified name
        ChapterThree.subB.B b = new ChapterThree.subB.B();
        a.printMe();
        aa.printMe();
        b.printMe();
        c.printMe();

    }

}
