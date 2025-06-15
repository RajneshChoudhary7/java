package finalpractices;

public class que5 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8, 20, 7};
        
        System.out.println("second largest :="+findSecondLargest(arr));
    }

    
    public static int findSecondLargest(int[] arr) {
    if (arr == null || arr.length < 2) {
        throw new IllegalArgumentException("Array must have at least two elements");
    }

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : arr) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num != largest) {
            secondLargest = num;
        }
    }

    if (secondLargest == Integer.MIN_VALUE) {
        throw new RuntimeException("No second largest element found");
    }


    return secondLargest;
    
}

    
}
