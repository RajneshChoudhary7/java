public class findmissingnum {
    public static void main(String[] args) {
    int arr[] = {3,0,1,2,5};
    int n = arr.length;
    int sum = 0;
    for(int i=0;i<n;i++){
        sum += arr[i];
    }
    int total = (n*(n+1))/2;
    int missingNum = total - sum;
    System.out.println("The missing number is: " + missingNum);
    }

    
}
