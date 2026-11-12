package espanol.cp07aplicacionesdetextoenjava.manejodearchivos;

import java.io.File;

public class EjemploArchivo {

    public static void main(String[] args) {
        // Representa un archivo en el directorio de trabajo actual.
        File archivo = new File("myfile.txt");

        // Representa un archivo dentro de la carpeta MyDocs.
        File archivoEnDocumentos = new File("MyDocs", "myfile.txt");

        mostrarDatosArchivo(archivo);
        mostrarDatosArchivo(archivoEnDocumentos);
    }

    private static void mostrarDatosArchivo(File archivo) {
        System.out.println("Ruta: " + archivo.getPath());
        System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
        System.out.println("Existe: " + archivo.exists());
        System.out.println();
    }
}
