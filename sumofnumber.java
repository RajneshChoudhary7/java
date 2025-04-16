import java.util.Scanner;

public class sumofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number to find sum of all digit = ");
        int num = sc.nextInt();
        int oldnum=num;
        int sum=0;
        for(int i=0;num!=0;i++)
        {
            sum = sum + num%10;
            num=num/10;
        }
        System.out.println("addition is = "+sum);
    }
    
}
