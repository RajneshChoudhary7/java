public class kthmax {
        public static int findKthMax(int[] arr, int k) {
            if (k <= 0 || k > arr.length) {
                throw new IllegalArgumentException("Invalid value of k");
            }
    
            int max = Integer.MIN_VALUE;
            int prevMax = Integer.MAX_VALUE;
    
            for (int i = 0; i < k; i++) {
                max = Integer.MIN_VALUE;
                for (int num : arr) {
                    if (num > max && num < prevMax) {
                        max = num;
                    }
                }
                prevMax = max;
            }
    
            return max;
        }
    
        public static void main(String[] args) {
            int[] arr = {5, 8, 12, 7, 6, 4, 10};
            int k = 3;
            System.out.println(k + "rd max is: " + findKthMax(arr, k)); // Output: 8
        }
    }
    
    

