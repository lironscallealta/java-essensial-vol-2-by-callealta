package espanol.cp04herenciasobrecargayconstructores.encadenamientodeconstructores;

class A {

    A() {
        System.out.println("A");
    }
}

class B extends A {

    B() {
        System.out.println("B");
    }
}

class C extends B {

    C() {
        System.out.println("C");
    }
}

public class EncadenamientoDeConstructores {

    public static void main(String[] argumentos) {
        C c = new C();
    }
}
