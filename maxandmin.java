import java.util.Scanner;

public class maxandmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array = ");
        int size = sc.nextInt();
        System.out.println("enter any array to find maximum and minimum = ");
        int[] arr = new int[size];
        for(int i=0;i<=size-1;i++)
        {
            arr[i]= sc.nextInt();
        }
        maxmin(arr,size);
    }


    static int maxmin (int arr[],int size)
    {
        
        int max=arr[size-1];
        int min=arr[0];
        int maxindex=size-1;
        int minindex=0;
        int arrlen=arr.length;
        for(int i=0;i<=size-1;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                maxindex=i;
            }
            if(min>arr[i])
            {
                min=arr[i];
                minindex=i;
            }
        }
        System.out.println("your maximum element is = "+max +" in "+maxindex+"th index");
        System.out.println("your minimum element is = "+min +" in "+minindex+"th index");
        return 0;
        
    }
}
