import java.util.Scanner;


public class calculator {
    public static void main(String[] args) {
        
    

    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char o = sc.next().charAt(0);
        switch(o)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b==0)
                {
                    System.out.println("INF");
                }
                else
                {
                    System.out.println(a/b);
                }
                break;
            case '%':
                System.out.println(a%b);
                break;
            default :
                System.out.println("NA");

        }
           sc.close();     
    }
}
