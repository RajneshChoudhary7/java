public class eletoelesum {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4};
        int [] arr2={2,3,4,5};
        int [] sum = new int [arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            sum[i]=arr1[i]+arr2[i];
        }

        for(int j=0;j<4;j++)
        {
            System.out.print(sum[j]+"   ");
        }
        for(int j=0;j<4;j++)
        {
            System.out.print(arr1[j]+"   ");
        }
        for(int j=0;j<4;j++)
        {
            System.out.print(arr2[j]+"   ");
        }

    }
    
}
