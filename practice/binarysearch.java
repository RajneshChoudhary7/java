package practice;
import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[]={2,4,67,23,1};
        for(int i=0;i<=arr.length-1 ;i++)
        {
            for(int j=0;j<=arr.length-1;j++)
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
        for(int i=0 ;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+"   ");
        }

        System.out.println("enter any number to find in array = ");
        int target = sc.nextInt();

        int start=0;
        int end = arr.length-1;
        int mid=0;

        while(start<= end)
        {
            mid = (start+end)/2;

            if(arr[mid]==target){
                System.out.println("element is found at "+mid+" index");
                break;
            }
            else if(arr[mid]>target)
            {
                end= mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        if(start>end)
        {
            System.out.println("element not found ");
        }
    
        
    
}
}
