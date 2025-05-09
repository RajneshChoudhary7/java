package practice;
import java.util.Scanner;

public class method {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        

        method obj = new method();
        int sum =obj.fun1();
        System.out.println(sum);
    }

    public int fun1() {
        System.out.println("enter number a = ");
        int A = sc.nextInt();
        System.out.println("enter number a = ");
        int B = sc.nextInt();

        return A+B;

    }

}
