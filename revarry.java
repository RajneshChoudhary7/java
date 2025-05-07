import java.util.Scanner;

public class revarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array = ");
        int size = sc.nextInt();
        System.out.println("enter any array to find reverse= ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }

        System.out.println("you nomal array is :- ");
        for(int i : arr)
        {
            System.out.print("  "+ i);
        }
        System.out.println();
        int i=0;
        int j=size-1;
        for(;i<j;i++,j--)
        {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
        }


        System.out.println("after reverse array is :- ");
        for(int k : arr)
        {
            System.out.print("  "+ k);
        }

     }
    
    
}
