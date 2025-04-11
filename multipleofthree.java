import java.util.Scanner;

public class multipleofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number to check its multile or not = ");

        int num = sc.nextInt();
        if(num%3==0)
        {
            System.out.println("this number is multiple of 3 ");
        }
        else
        {
            System.out.println("this number is not multiple of 3 ");
        }
    }
    
}
