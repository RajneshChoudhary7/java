package practice;
import java.util.Scanner;

public class evenoddarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array = ");
        int size = sc.nextInt();
        int [] arr= new int[size];
        System.out.println("enter the element of array  :-");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+"   ");
            
        }
        System.out.println();
        int even=0;
        int odd=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Even = "+even +"       Odd = "+odd);

    }
    
}
