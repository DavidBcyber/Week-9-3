import java.util.Scanner;  // Import the Scanner class

public class Main3 {
    public static void main(String[] args){
        System.out.println("Welcome to Temperature Converter");

        Scanner myCel = new Scanner(System.in); //Scanner Object
        System.out.println("Enter the tenperature:");
        int F = myCel.nextInt();

        int C = 32;

        int Cl = 5;

        int Cll = 9;

        
        System.out.println(F+"F degree is equivalent to:"+ ((F - C )* Cl / Cll));

    }
    
}
