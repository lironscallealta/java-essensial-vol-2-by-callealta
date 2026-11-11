package english.c06exceptionsandassertions.codingtask.doing.codingtasktwo;
import static english.c06exceptionsandassertions.codingtask.doing.codingtasktwo.Pythagorean.*;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in); 
    System.out.println("right number 1: ");
    double n1 = input.nextDouble();  
    System.out.println("right number 2: ");  
    double n2 = input.nextDouble();    


     System.out.println("Result is: "); 
    System.out.println(pythagoreanTheorem(n1, n2));      
        
    }

    
    

}
