import java.util.Scanner;

public class secondmax {
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

        int max = arr[0];
        for(int i=0;i<size;i++)
        {
            if(max<arr[i])
            max=arr[i];
        }
        System.out.println("max number  = "+max);
        arr[0]=max;
        int secmax=arr[1];
        for(int i=1;i<size;i++)
        {
            if(secmax<arr[i])
            secmax=arr[i];
        }
        if(max>secmax)
        {
            System.out.println("second max is = "+secmax);
        }
    }
    
}
