import java.util.Scanner;

public class stringshort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number = ");
        int num = sc.nextInt();
        String str= Integer.toString(num);
        int size = str.length();
        str=str.substring(size-1,size)+str.substring(1,size-1)+str.substring(0,1);
        num = Integer.parseInt(str);
        System.out.println("you final index is =  "+num);

    }
    
}
