package english.cp05otherclassfeatures.funtionalinterfaceandlambda;

@FunctionalInterface
interface Greeter2 {
    public String afterBirthday(String name, int age);
}

public class LambdaAnotherExample {

    public static void main(String[] args) {
        Greeter2 g = (name, age) -> {
            return name + ", next year you will be " + (age + 1) + " years old.";
        };
        System.out.println(g.afterBirthday("Julio", 39));
        String nextYear = g.afterBirthday("Pedro", 20);
        System.out.println(nextYear);
    }

}
