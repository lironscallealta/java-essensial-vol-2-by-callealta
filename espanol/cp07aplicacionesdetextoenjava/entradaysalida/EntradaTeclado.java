package espanol.cp07aplicacionesdetextoenjava.entradaysalida;
import java.io.*;

public class EntradaTeclado {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingresa texto " +
                "y pulsa Ctrl + D o Ctrl + Z para terminar.");

        String str = br.readLine();

        while (str != null) {
            System.out.println("Leído: " + str);
            str = br.readLine();
        }

        br.close();
    }
}

// En Windows, Ctrl + Z indica el fin de la entrada y readLine() devuelve null.