package practice;
import java.util.Scanner;

public class weekdays {
    public static void main(String[] args) {
        System.out.println("welocme to find week days");
        System.out.println("enter any number according to week = ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
                case 2:
                System.out.println("tuesday");
                break;
                case 3:
                System.out.println("wednusday");
                break;
                case 4:
                System.out.println("thusday");
                break;
                case 5:
                System.out.println("friday");
                break;
                case 6:
                System.out.println("satruday");
                break;
                case 7:
                System.out.println("sunday");
                break;
                
            default:
            System.out.println("wrong choice");
                break;
        }

    }
    
}
