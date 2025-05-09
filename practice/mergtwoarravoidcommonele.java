package practice;
public class mergtwoarravoidcommonele {
    public static void main(String[] args) {
        System.out.println("Welcome to merge two array without common element ");
        int [] arr = {1,2,3,4}; 
        int [] arr1 ={2,3,4,5};
        int [] arr2 = new int[arr.length+arr1.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            boolean isCommon = false;
            for(int j=0;j<arr1.length;j++)
            {
                if(arr[i]==arr1[j])
                {
                    isCommon = true;
                    break;
                }
            }
            if(!isCommon)
            {
                arr2[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            boolean isCommon = false;
            for(int j=0;j<arr.length;j++)
            {
                if(arr1[i]==arr[j])
                {
                    isCommon = true;
                    break;
                }
            }
            if(!isCommon)
            {
                arr2[k]=arr1[i];
                k++;
            }
        }
        System.out.println("The final array is :");
        for(int i=0;i<k;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
    
}
