package espanol.cp07aplicacionesdetextoenjava.lecturayescritura;

// EscribirArchivo.java
import java.io.*;

public class EscribirArchivo {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Uso: EscribirArchivo <ruta del archivo>");
            return;
        }

        File archivo = new File(args[0]);

        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            // Abre el archivo para escritura.
            PrintWriter out = new PrintWriter(new FileWriter(archivo));

            String s;

            System.out.println("Ingresa el texto del archivo:");
            System.out.println("Pulsa Ctrl + Z para terminar.");

            while ((s = bf.readLine()) != null) {
                out.println(s);
            }

            bf.close();
            out.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo no encontrado: " + args[0]);
        } catch (IOException ioe) {
            System.out.println("Ocurrió una IOException");
        }
    }
}
// java espanol/cp07aplicacionesdetextoenjava/lecturayescritura/EscribirArchivo.java myfile.txt
