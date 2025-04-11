import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number to find all sum  = ");
        int num = sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=num)
        {
            sum+=i;
            i++;
        }
        System.out.println("sum of 1 to n = " +sum);
    }
    
}
