package ChapterThree.Packages.ImportExamples;

// TEMA: paquetes e importaciones. Empieza a leer el ejemplo desde este archivo.
// Consulta ../README.md para ver el propósito de cada carpeta.
// Import con *: permite usar las clases públicas de subA por su nombre simple.
// No incluye las clases del subpaquete subAA.
import ChapterThree.Packages.subA.*;
// Import explícito: permite usar la clase AA de un subpaquete.
import ChapterThree.Packages.subA.subAA.AA;
// Alternativa para B: descomenta este import y usa B en vez del nombre completo.
// import ChapterThree.Packages.subB.B;
import ChapterThree.Packages.subC.*;

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
        ChapterThree.Packages.subB.B b = new ChapterThree.Packages.subB.B();
        a.printMe();
        aa.printMe();
        b.printMe();
        c.printMe();

    }

}
