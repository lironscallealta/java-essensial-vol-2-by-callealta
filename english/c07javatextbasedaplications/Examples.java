package english.c07javatextbasedaplications;

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

    }

}
