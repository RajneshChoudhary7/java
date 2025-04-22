public class meargtwoarray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] arr1 ={2,3,4,5};
        int [] arr2 = new int[arr.length+arr1.length];
        for(int i=0;i<arr.length;i++)
        {
            arr2[i]=arr[i];
        }
        for(int i=0;i<arr1.length;i++)
        {
            arr2[arr.length+i]=arr1[i];
        }
        System.out.println("the final array is :");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
    
}
