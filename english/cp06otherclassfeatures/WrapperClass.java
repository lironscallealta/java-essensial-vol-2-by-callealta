package english.cp06otherclassfeatures;

public class WrapperClass {

    int num = 100;
    Integer i = num;// box-in
    Integer j = 200;// box-in
    int num2 = j.intValue();// box-out

    int sum = i + j; // Error

}
