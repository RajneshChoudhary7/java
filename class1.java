import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number = ");
        int num = sc.nextInt();
        int digit = countdigit(num);
        int arr[] = new int[digit];
        for(int i=0;num!=0;i++)
        {
            int rem = num %10;
            arr[i]=rem;
            num=num/10;
        }
        System.out.println("converted array is = ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    static int countdigit(int x)
    {
        int rem=0;
        int digitt=0;
        while (x!=0) {
            rem=x%10;
            digitt++;
            x=x/10;

        }
        return digitt;
    }
    
}
