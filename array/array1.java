import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element of array :-");
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = (int) sc.nextInt();
        }
        System.out.println("array element is = ");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();

    }
}
