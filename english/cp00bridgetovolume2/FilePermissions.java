package english.cp00bridgetovolume2;

public class FilePermissions {
    public static void main(String[] args) {
        // STEP 1: Each permission gets its own bit position.
        // Position:  8  4  2  1
        // READ:      0  0  0  1
        // WRITE:     0  0  1  0
        // EXECUTE:   0  1  0  0
        // The 1 marks that permission's position. In Java, 0b starts
        // a binary number.
        final int READ = 0b0001;
        final int WRITE = 0b0010;
        final int EXECUTE = 0b0100;

        // STEP 2: Ana has WRITE and EXECUTE.
        // | combines those permissions:
        //   WRITE:    0010
        //   EXECUTE:  0100
        //             ----
        //   Ana has:  0110
        // READ is not included.
        int permissionsForAna = WRITE | EXECUTE;

        // STEP 3: Ask whether Ana can READ.
        // General rule for one column:
        //   1 & 1 gives 1
        //   1 & 0 gives 0
        //   0 & 1 gives 0
        //   0 & 0 gives 0
        // This is the rule for each column. A pair of 1s appears only
        // when both numbers have 1 in the same position.
        //
        // Compare Ana's 0110 with READ's 0001:
        // Position:          8  4  2  1
        // Ana's permissions: 0  1  1  0
        // READ:              0  0  0  1
        //                    ---------
        // Pairs:             0&0 1&0 1&0 0&1
        // Result:             0   0   0   0
        // There is no 1&1 pair here because the 1s are in different
        // positions. The result 0000 has decimal value 0.
        int readMatch = permissionsForAna & READ;

        // != means "not equal to". This asks whether readMatch differs
        // from 0. It is 0, so the condition is false and else runs.
        if (readMatch != 0) {
            System.out.println("Ana can read the file");
        } else {
            System.out.println("Ana cannot read the file");
        }

        // STEP 4: Ask whether Ana can WRITE.
        // Compare Ana's 0110 with WRITE's 0010:
        // Position:          8  4  2  1
        // Ana's permissions: 0  1  1  0
        // WRITE:             0  0  1  0
        //                    ---------
        // Pairs:             0&0 1&0 1&1 0&0
        // Result:             0   0   1   0
        // This time, both have 1 in the position worth 2.
        // Result 0010 is 2, which differs from 0.
        int writeMatch = permissionsForAna & WRITE;
        if (writeMatch != 0) {
            System.out.println("Ana can save changes");
        } else {
            System.out.println("Ana cannot save changes");
        }

        // STEP 5: Ask whether Ana can EXECUTE.
        // Compare Ana's 0110 with EXECUTE's 0100:
        // Position:          8  4  2  1
        // Ana's permissions: 0  1  1  0
        // EXECUTE:           0  1  0  0
        //                    ---------
        // Pairs:             0&0 1&1 1&0 0&0
        // Result:             0   1   0   0
        // Both have 1 in the position worth 4.
        // Result 0100 is 4, which differs from 0.
        int executeMatch = permissionsForAna & EXECUTE;
        if (executeMatch != 0) {
            System.out.println("Ana can execute the file");
        } else {
            System.out.println("Ana cannot execute the file");
        }

        // OUTPUT:
        // Ana cannot read the file
        // Ana can save changes
        // Ana can execute the file
        //
        // SUMMARY:
        // | combines permissions and stores them together.
        // & compares the stored permissions with one permission.
        // If the result differs from 0, at least one bit matched.
        // Each permission here uses one bit, so a match means
        // that permission is enabled.
    }
}
