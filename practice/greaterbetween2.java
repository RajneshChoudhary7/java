package practice;
import java.util.Scanner;

public class greaterbetween2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println( "enter number to find max between two = ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2)
        {
            System.out.println("number 1 is greater ");
        }
        else if(num1==num2)
        {
            System.out.println("number 1 is equal to number 2");
        }
        else 
        {
            System.out.println("number two is greater ");
        }
    }
    
}
