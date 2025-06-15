package dsaquestion;

import java.util.Arrays;

public class q3 {

     public static void kthMinMax(int[] arr, int k) {
        if (k < 1 || k > arr.length) {
            System.out.println("Invalid K");
            return;
        }
        Arrays.sort(arr);
        System.out.println("Kth Min: " + arr[k-1] + ", Kth Max: " + arr[arr.length - k]);
    }
}
