package dsaquestion;

public class q11 {
    public static void main(String[] args) {
        int arr[] = {12,23,34,45,45};
        System.out.print(rearrangeAlternating(arr));
    }
    public static void rearrangeAlternating(int[] arr) {
    int i = -1, n = arr.length;
    // Partition negatives to left, positives to right
    for (int j = 0; j < n; j++) {
        if (arr[j] < 0) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    int pos = i + 1, neg = 0;
    // Rearrange in alternating pattern
    while (pos < n && neg < pos && arr[neg] < 0) {
        int temp = arr[neg];
        arr[neg] = arr[pos];
        arr[pos] = temp;
        neg += 2;
        pos++;
    }
}
    
}
