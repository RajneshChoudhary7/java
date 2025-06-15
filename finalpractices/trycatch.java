package finalpractices;

public class trycatch {
    public static void main(String[] args) {
 int[] arr = {1, 2, 3};
 try {
 System.out.println(arr[5]);
 } catch (Exception e) {
 System.out.println("Exception occurred: " + e);
 }
 System.out.println("End of program");
 }
    
}
