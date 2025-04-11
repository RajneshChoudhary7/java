import java.util.Scanner;

public class asciicode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any char to find ascii code = ");

        char ch = sc.next().charAt(0);
        int ascii = (int)ch;
        System.out.println("char = "+ ch +"\nascii code = "+ascii);
    }
    
}
