package dsaquestion;

public class q9 {
    public static boolean isSortedRotated(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i + 1) % arr.length]) {
                count++;
            }
        }
        return count <= 1;
    }
}
