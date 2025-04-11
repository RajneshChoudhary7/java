import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number to print loop = ");
        int num = sc.nextInt();
        for(int i = 1; i<=num;i++ )
        {
            System.out.println(i);
        }
        sc.close();
    }
    
}
