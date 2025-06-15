package arrays2d;
import java.util.*;
public class matrixmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of row and column first matrix ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("enter the element of row and column first matrix ");
        int [][] one = new int[r1][c1];
        for(int i=0 ;i <r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                one[i][j]=sc.nextInt();
            }
        }
    
        System.out.println("enter the size of row and column second matrix ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
         
        System.out.println("enter the element of row and column first matrix ");
        int [][] two = new int[r2][c2];
        for(int i=0 ;i <r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                two[i][j]=sc.nextInt();
            }
        }

        if(c1 != r2){
            System.out.println("invalid input");
            return;
        }

        int [][]prd = new int[r1][c2];
        for(int i=0;i<prd.length;i++)
        {
            for( int j=0;j<prd[0].length;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    prd[i][j]+=one[i][k]*two[k][j];
                }
            }
        }
         System.out.println("here is the matrix multiplication ");
        for(int i=0;i<prd.length;i++)
        {
            for( int j=0;j<prd[0].length;j++)
            {
                System.out.print(prd[i][j]+" ");
            }
            System.out.println();
        }
    }

    }
    

