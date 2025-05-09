package practice;
import java.util.Scanner;

public class reverseofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number for find its reverse order = ");
        int num = sc.nextInt();
        int rev=0;
        for(int i=0;num>0;i++)
        {
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;

        }
        System.out.println("reverse = "+rev);
    }
    
}
