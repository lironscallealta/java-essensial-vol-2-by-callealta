package english.cp06otherclassfeatures.wrapperclasses;

public class WrapperClass {

    int num = 100;
    Integer i = num;// box-in
    Integer j = 200;// box-in
    int num2 = j.intValue();// box-out

    int sum = i + j; // Valid: both Integer values are automatically unboxed to int.

    Integer anyNumber = Integer.valueOf(5); // -> Integer anyNumber = 5

}
