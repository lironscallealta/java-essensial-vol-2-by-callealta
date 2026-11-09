package english.c06exceptionsandassertions.keywordthrows.irmprovedfinaloreffectivelyfinalvariablerethow;

public class AfterJDK11 {

    public static void main(String[] args) throws Exception {
        try {
            processData(null);
        } catch (Exception e) {
            // Reassign and rethrow the same variable (Allowed in JDK 11+)
            e = new Exception("Updated message: " + e.getMessage());
            throw e;
        }
    }

    static void processData(String input) throws Exception {
        if (input == null) {
            throw new Exception("Input cannot be null!");
        }
    }
}
