import java.util.Scanner;

public class palandrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find its palandrom or not = ");
        int num=sc.nextInt();
        int rem=0;
        int  oldnum=num;
        int palan=0;
        while(num>)
        {
            rem=num%10;
            palan=palan*10+rem;
            num=num/10;
        }
        if(oldnum==palan)
        {
            System.out.println("yes this number is palandrom");
        }
        else{
            System.out.println("yes this number is not palandrom");
        }
    }
    
}
