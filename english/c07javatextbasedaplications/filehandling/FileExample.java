package english.c07javatextbasedaplications.filehandling;

import java.io.File;

public class FileExample {

    public static void main(String[] args) {
        // Represents a file in the current working directory.
        File myFile = new File("myfile.txt");

        // Represents a file inside the MyDocs folder.
        File myDocsFile = new File("MyDocs", "myfile.txt");

        printFileInfo(myFile);
        printFileInfo(myDocsFile);
    }

    private static void printFileInfo(File file) {
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Exists: " + file.exists());
        System.out.println();
    }
}
