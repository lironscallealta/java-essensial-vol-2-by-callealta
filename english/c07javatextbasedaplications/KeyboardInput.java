package english.c07javatextbasedaplications;
import java.io.*;

public class KeyboardInput {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter text " +
                "and press Ctrl + D or Ctrl + Z to end.");

        String str = br.readLine();

        while (str != null) {
            System.out.println("Read: " + str);
            str = br.readLine();
        }

        br.close();
    }
}

// Ctrl + Z is equivalent to the null 