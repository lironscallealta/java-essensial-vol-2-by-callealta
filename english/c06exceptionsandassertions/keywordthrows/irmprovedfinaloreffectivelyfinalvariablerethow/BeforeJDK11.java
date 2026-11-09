package english.c06exceptionsandassertions.keywordthrows.irmprovedfinaloreffectivelyfinalvariablerethow;

public class BeforeJDK11 {

    public static void main(String[] args) throws Exception {
        try {
            processData(null);
        } catch (Exception e) {
            Exception ex = new Exception("Updated message: " + e.getMessage());
            throw ex;
        }
    }

    static void processData(String input) throws Exception {
        if (input == null) {
            throw new Exception("Input cannot be null!");
        }
    }
}
