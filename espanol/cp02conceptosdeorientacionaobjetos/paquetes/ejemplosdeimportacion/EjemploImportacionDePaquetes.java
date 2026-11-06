package espanol.cp02conceptosdeorientacionaobjetos.paquetes.ejemplosdeimportacion;

// TEMA: paquetes e importaciones. Empieza a leer el ejemplo desde este archivo.
// Consulta ../README.md para ver el propósito de cada carpeta.
// Import con *: permite usar las clases públicas de suba por su nombre simple.
// No incluye las clases del subpaquete subaa.
import espanol.cp02conceptosdeorientacionaobjetos.paquetes.suba.*;
// Import explícito: permite usar la clase AA de un subpaquete.
import espanol.cp02conceptosdeorientacionaobjetos.paquetes.suba.subaa.AA;
// Alternativa para B: descomenta este import y usa B en vez del nombre completo.
// import espanol.cp02conceptosdeorientacionaobjetos.paquetes.subb.B;
import espanol.cp02conceptosdeorientacionaobjetos.paquetes.subc.*;

/**
 * Ejemplo ejecutable para practicar paquetes e importaciones.
 * Las clases A, AA, B y C tienen métodos vacíos: al ejecutarlo no aparece texto.
 * El objetivo es ver cómo se usan clases que pertenecen a distintos paquetes.
 */
public class EjemploImportacionDePaquetes {

    public static void main(String[] argumentos) {

        A a = new A();
        AA aa = new AA();
        C c = new C();
        // Nombre completo: se puede usar B sin añadir un import.
        espanol.cp02conceptosdeorientacionaobjetos.paquetes.subb.B b = new espanol.cp02conceptosdeorientacionaobjetos.paquetes.subb.B();
        a.imprimir();
        aa.imprimir();
        b.imprimir();
        c.imprimir();

    }

}
