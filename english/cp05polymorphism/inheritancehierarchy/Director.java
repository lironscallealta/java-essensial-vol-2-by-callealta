package english.cp05polymorphism.inheritancehierarchy;

public class Director extends Manager {

    public double carAllowance(){
        return 0.0;
    }

    public void increaseAllowance(){
        System.out.println("Empty");
    }

}
