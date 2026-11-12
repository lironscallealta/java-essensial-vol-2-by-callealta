package espanol.cp07aplicacionesdetextoenjava.lecturayescritura;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Uso: LeerArchivo <ruta del archivo>");
            return;
        }

        File archivo = new File(args[0]);
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String str;

            while ((str = br.readLine()) != null) {
                System.out.println("Leído: " + str);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + archivo);
        } catch (IOException ioe) {
            System.out.println("Error de entrada/salida");
        }
    }
}

// java espanol/cp07aplicacionesdetextoenjava/lecturayescritura/LeerArchivo.java myfile.txt
