package english.cp03packagesandencapsulation.packages.importexamples;

// TEMA: paquetes e importaciones. Empieza a leer el ejemplo desde este archivo.
// Consulta ../README.md para ver el propósito de cada carpeta.
// Import con *: permite usar las clases públicas de suba por su nombre simple.
// No incluye las clases del subpaquete subaa.
import english.cp03packagesandencapsulation.packages.suba.*;
// Import explícito: permite usar la clase AA de un subpaquete.
import english.cp03packagesandencapsulation.packages.suba.subaa.AA;
// Alternativa para B: descomenta este import y usa B en vez del nombre completo.
// import english.cp03packagesandencapsulation.packages.subb.B;
import english.cp03packagesandencapsulation.packages.subc.*;

/**
 * Ejemplo ejecutable para practicar paquetes e importaciones.
 * Las clases A, AA, B y C tienen métodos vacíos: al ejecutarlo no aparece texto.
 * El objetivo es ver cómo se usan clases que pertenecen a distintos paquetes.
 */
public class PackageImportsExample {

    public static void main(String[] args) {

        A a = new A();
        AA aa = new AA();
        C c = new C();
        // Nombre completo: se puede usar B sin añadir un import.
        english.cp03packagesandencapsulation.packages.subb.B b = new english.cp03packagesandencapsulation.packages.subb.B();
        a.printMe();
        aa.printMe();
        b.printMe();
        c.printMe();

    }

}
