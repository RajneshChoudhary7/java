package practice;
public class sortalgo {
    static int arr[]={12,34,4,5,68,1,90,0,23};
    public static void main(String[] args) {

        System.out.println("before sort ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();


        sort(0,arr.length-1);

        System.out.println("after sort");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }

    static void sort (int l , int h)
    {
        if(!(l<h))
        return;
        int max=arr[l];
        int min=arr[l];
        int maxindex=l;
        int minindex=l;
        int arrlen=arr.length;
        for(int i=l;i<=h;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                maxindex=i;
            }
            if(min>arr[i])
            {
                min=arr[i];
                minindex=i;
            }
        }
        arr[minindex]=arr[l];
        arr[l]=min;
        arr[maxindex]=arr[h];
        arr[h]=max;
        sort(l+1, h-1);
        
        
    }
    
}
