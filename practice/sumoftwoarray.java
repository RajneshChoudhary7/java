package practice;
import java.util.Scanner;

public class sumoftwoarray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr1= {1,2,3,4};
        int[] arr2= {1,2,3,4};
        int sum1=0;
        int sum2=0;
        for(int i=0;i<4;i++)
        {
            
            sum1+=arr1[i];
            sum2+=arr2[i];
        }
        System.out.println("sum of array = "+(sum1+sum2));
    }
    
}
