import java.util.Scanner;

public class floatintoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any float number = ");
        float num = sc.nextFloat();
        System.out.println("float num = "+num+"f");

        int num1= (int)num;
        System.out.println("int num = "+num1);

    }
    
}
