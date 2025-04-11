import java.util.Scanner;

public class posnegzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any  to find number is postive negitive or zero = ");

        int num = sc.nextInt();
        if(num>0)
        {
            System.out.println("Positive");
        }
        else if(num==0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Negetive");
        }
    }
    
}
