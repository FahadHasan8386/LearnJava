package solution.userinput;
import java.util.Scanner;
public class FactorialJava {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int num;
        int fact = 1;
        System.out.print("Enter a positive integeer : ");
        num = input.nextInt();
        for (int i = num ; i >= 1 ; i--){
            fact = fact * i;
            System.out.print( i+ " ");
        }
        System.out.println(" ");
        System.out.println("Factorial of " +num + " = "+fact);
    }
    
}
