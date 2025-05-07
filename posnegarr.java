import java.util.Scanner;

public class posnegarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array = ");
        int size = sc.nextInt();
        System.out.println("enter any array in positive or negetive form  = ");
        int[] arr = new int[size];
        int zero=0;
        int ones=0;
        int twos=0;
        for(int i=0;i<=size-1;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.print("before shorted array of positive ang negitive ");
        for(int i : arr)
        {
            System.out.println("  "+i);
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                    if(arr[i]<arr[j])
                    {
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
            }
        }
        System.out.println("after shorted array of positive ang negitive ");
        for(int i : arr)
        {
            System.out.print("  "+i);
        }

    }
    
    
}
