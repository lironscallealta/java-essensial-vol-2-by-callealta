package english.c07javatextbasedaplications.readingandwritting;

// WriteFile.java
import java.io.*;

public class WriteFile {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: WriteFile <file path>");
            return;
        }

        File myFile = new File(args[0]);

        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            // Opens the file for writing.
            PrintWriter out = new PrintWriter(new FileWriter(myFile));

            String s;

            System.out.println("Enter File Text:");
            System.out.println("Press Ctrl + Z to end!");

            while ((s = bf.readLine()) != null) {
                out.println(s);
            }

            bf.close();
            out.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("File Not Found " + args[0]);
        } catch (IOException ioe) {
            System.out.println("IOException occurred");
        }
    }
}
// java english\c07javatextbasedaplications\readingandwritting\WriteFile.java myfile.txt
