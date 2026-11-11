package english.c07javatextbasedaplications;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {

    public static void main(String[] args) throws IOException, InterruptedException {
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter text " + "and press Ctrl + D or Ctrl + Z to end.");
            String str = br.readLine();
            int number = 0;
            while (str != null) {
                System.out.println(number + " Read: " + str);
                Thread.sleep(500);
                number += 1;
            }

        }

    }
}
