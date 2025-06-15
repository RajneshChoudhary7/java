package finalpractices;
import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner buff = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("enter the element of array = 3 *3 = ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=buff.nextInt();
            }
        }

        System.out.println("here is the 2 dimenal array :- ");
            for(int i=0;i<arr.length;i++){
                System.out.println();
            for(int j=0;j<arr.length;j++)
            {
               System.out.print(arr[i][j]+"   ");
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
                System.out.println();
            for(int j=0;j<arr[i].length;j++)
            {
               sum+=arr[i][j];
            }
        }
        System.out.println(" Total sum = "+sum);
        for(int i=0;i<arr.length;i++){
                int rowSum=0;
            for(int j=0;j<arr[i].length;j++)
            {
               rowSum+=arr[i][j];
            }
            System.out.println("sum of row "+i+" : "+rowSum);
        }


        for(int j=0; j<arr[0].length;j++)
        {
            int colSum=0;
            for(int i=0 ;i< arr.length;i++)
            {
                colSum += arr[i][j];
            }
            System.out.println("som of column "+j+" : "+colSum);
        }


    }
    
}
