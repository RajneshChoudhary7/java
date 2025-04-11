import java.util.Scanner;

public class findnumisprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 2;

        System.out.println("enter any number to find its prime of not = ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("this number is nither prime or not composite ");
        } else if (num == 1) {
            System.out.println("this number is nither prime of not composite ");
        } else if (num == 2) {
            System.out.println("this number is first prime  ");
        } else {

            for (; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("number is not prime ");
                    break;
                }
            }

            if (i == num)
                System.out.println("prime number ");
        }
    }

}