package english.cp06otherclassfeatures.javainterfaces;

public class InterfacesExtends {

    interface I1 {
        public void doStuff();
    }

    interface I2 {
        public void doSomething();
    }

    interface I3 extends I1, I2 {

        public void doSomethingElse();

    }

}
