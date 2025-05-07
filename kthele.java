import java.util.Scanner;

public class kthele {
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
        arr=sorting(arr);
        for(int i :arr)
        {
            System.out.print(i+"   ");
        }
        
        System.out.println();
        System.out.println("enter your kth elememt = ");
        int kth = sc.nextInt();
        System.out.println("your "+kth+"th min element is = "+arr[kth-1]);
        System.out.println("your "+kth+"th max element is = "+arr[size-kth]);


    }
    static int[] sorting(int arr[])
    {
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
        return arr;

    }
}
