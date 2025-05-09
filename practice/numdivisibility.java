package practice;
import java.util.Scanner;

public class numdivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number to check number is divisible by 5 or 11 and not divisible = ");

        int num = sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println("divisible");
        }
        else
        {
            System.out.println("not divisible");
        }
    }
    
}
