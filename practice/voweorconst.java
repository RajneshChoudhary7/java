package practice;
import java.util.Scanner;

public class voweorconst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any char for find weater charachter is vowel or constant = ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a': System.out.println("vowel");
                break;

                case 'e': System.out.println("vowel");
                break;

                case 'i': System.out.println("vowel");
                break;

                case 'o': System.out.println("vowel");
                break;

                case 'u': System.out.println("vowel");
                break;

                case 'A': System.out.println("vowel");
                break;

                case 'E': System.out.println("vowel");
                break;

                case 'I': System.out.println("vowel");
                break;

                case 'O': System.out.println("vowel");
                break;

                case 'U': System.out.println("vowel");
                break;

                
            default:
            System.out.println("consonent");
                break;
        }
    }
    
}
