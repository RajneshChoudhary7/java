package practice;
import java.util.Scanner;

public class bubbleshort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array = ");
        int size =sc.nextInt();
        System.out.println("enter the elements of array :- ");
        int arr [] = new int[size];
        for(int i=0 ;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=size ;i++)
        {
            for(int j=1;j<=size ;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("you shorted array is = ");
        for(int i=0 ;i<=size;i++)
        {
            System.out.println(arr[i]+"   ");
        }

        
        sc.close();
    }
    
    
}
