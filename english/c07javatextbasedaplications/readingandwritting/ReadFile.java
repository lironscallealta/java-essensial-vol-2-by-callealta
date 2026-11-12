package english.c07javatextbasedaplications.readingandwritting;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: ReadFile <file path>");
            return;
        }

        File myFile = new File(args[0]);
        try {
            BufferedReader br = new BufferedReader(new FileReader(myFile));
            String str;

            while ((str = br.readLine()) != null) {
                System.out.println("Read: " + str);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found " + myFile);
        } catch (IOException ioe) {
            System.out.println("IOEXCEPTION");
        }
    }
}

// java english\c07javatextbasedaplications\readingandwritting\ReadFile.java myfile.txt
