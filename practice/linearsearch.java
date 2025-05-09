package practice;
import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array = ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the element of array  :-");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "   ");

        }
        System.out.println();
        System.out.println("enter any number to find in array = ");
        int num = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println(i);
            if (arr[i] == num)
                ;
            {
                System.out.println("element is found in " + i + "Index ");
                break;
            }

        }

    }

}
