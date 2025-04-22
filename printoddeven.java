import java.util.Scanner;

public class printoddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for find the number is even or odd: ");
        for(int i=0;i<10;i++)
        {
            int num = sc.nextInt();
            if(num==0)
            {
                System.out.println(num+" is neither even nor odd ");
            }
            else if(num%2==0)
            {
                System.out.println(num+" is even number ");
            }
            else
            {
                System.out.println(num+" is odd number ");
            }
        }
        sc.close();
    }
    
}
