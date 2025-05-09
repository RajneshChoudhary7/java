package practice;
public class fun2{

    static int targetsum(int arr1[], int target)
    {

        for(int i=0;i<arr1.length;i++){
            if(target == arr1[i]){
                return i;
                
            }
            
            }
            return -1;
        }
    
    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3, 4, 5};
        int target = 2;
        int result = targetsum(arr,target);
        if(result==-1)
        {
            System.out.println("number is not found");
        }
        else 
        {
            System.out.println("number is found = "+result);
        }
    
    }
}
    

