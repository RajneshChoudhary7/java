package practice;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        byte n1 = 127;
        short n2 = n1;
        System.out.println(n2);

        System.out.println("after conversion");
         n1 = (byte) n2;
        System.out.println(n1);


        /// //////////////


        int n3 = 234552344;
        long n4 = n3;
        System.out.println(n4);
        n3 = (int )n4;

        System.out.println("after conversion");


        /// //////////////////


        int n5 = 234;
        double n6 = n5;
        n5 = (int)n6;
        System.out.println("after conversion");
        System.out.println(n5);

        /// //////////////////


        int a = 'A';
        System.out.println(a);

        /// /////////////

        int x= 10;
        int y= 20;
        System.out.println("before swap ");
        System.out.println( " x= "+x);
        System.out.println("y = "+y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("after swap ");
        System.out.println( " x= "+x);
        System.out.println("y = "+y);

        /// ///////////////////////

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a char and check his ascii value = ");
        char ch = sc.next().charAt(0);
        System.out.println((int)ch);

        /// ///////////////////


        int w = 5;
        double v = 10;
        System.out.println(w + v);
        // 15.0


        /// ///////////////


        int m1 = 10;
        int m2 = 20;
        float m3 = 30;
        float m4 = 40;
        System.out.println(m1 + m2 + m3 + m4);


        /// ////////////////////////

        System.out.println("enter you  name = ");
        String name = sc.next();
        System.out.println("enter you age = ");
        int age = sc.nextInt();
        System.out.println("my name is " + name + " and i am "+age +" years old ");


        /// //////////////


        System.out.println("swaping number without using third variable ");
        int a1 = 10;
        int b1 = 20;

        System.out.println("before swap");
        System.out.println(" a1 = " +a1);
        System.out.println(" b1= "+b1);

        a1=a1+b1;
        b1=a1-b1;
        a1=a1-b1;
        System.out.println("AFTER swap");
        System.out.println(" a1 = " +a1);
        System.out.println(" b1= "+b1);


    }
    
}
