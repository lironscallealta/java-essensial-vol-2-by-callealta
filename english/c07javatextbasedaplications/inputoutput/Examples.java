package english.c07javatextbasedaplications.inputoutput;

public class Examples {

    public static void main(String[] args) {

        String strNum = "100";
        System.out.println(strNum.getClass().getSimpleName());
        byte b = Byte.parseByte(strNum);// Converts to byte
        System.out.println(b + " - byte");
        short s = Short.parseShort(strNum);// Converts to short
        System.out.println(s + " - short");
        int i = Integer.parseInt(strNum);// Converts to int
        System.out.println(i + " - int");
        long lNum = Long.parseLong(strNum);// Converts to long
        System.out.println(lNum + " - long");

        String sNum = "1.1";
        System.out.println("Number: " + sNum);
        float f = Float.parseFloat(sNum); // Converts to float
        System.out.println(f + " - float");
        double d = Double.parseDouble(sNum); // Converts to double
        System.out.println(d + " - double");

        String str = "true";
        System.out.println(str + ": String");

        boolean convertTrue = Boolean.parseBoolean(str); // Converts to boolean
        System.out.println(convertTrue + ": Type");
        /*
         * This is useful for processing flags or toggles represented as strings, such
         * as configuration settings or user preferences.
         * 
         * By understanding these conversions, developers can seamlessly transform
         * string-based inputs into appropriate data types, enabling accurate and
         * efficient computations.
         */

    }

}
