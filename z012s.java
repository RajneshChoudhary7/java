import java.util.Scanner;

public class z012s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array = ");
        int size = sc.nextInt();
        System.out.println("enter any array (only 0,1,2) = ");
        int[] arr = new int[size];
        int zero=0;
        int ones=0;
        int twos=0;
        for(int i=0;i<=size-1;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("before shorted array of 0's 1's & 2's ");
        for(int i : arr)
        {
            System.out.println("  "+i);
        }
        System.out.println();

        for(int i=0;i<=size-1;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
            if(arr[i]==1)
            {
                ones++;
            }
            if(arr[i]==twos)
            {
                twos++;
            }
        }

        for(int i=0;i<size;i++)
        {
            if(zero!=0)
            {
                arr[i]=0;
                zero--;
            }
            else if(ones!=1)
            {
                arr[i]=1;
                ones--;
            }
            else
            {
                arr[i]=2;
                twos--;
            }
        }
        System.out.println("after shorted array of 0's 1's & 2's ");
        for(int i : arr)
        {
            System.out.println("  "+i);
        }
    }
    
}
