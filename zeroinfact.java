public class zeroinfact {
    public static void main(String[] args) {
        // Count trailing zeros in a factorial
        // Input: n
        // Output: Count how many trailing zeros are in n!
        // Example: n = 10, Output: 2 (since 10! = 3628800)

        System.out.println("Enter a number to find the number of trailing zeros in its factorial:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int i = 5;
        while (n / i >= 1) {
            count += n / i;
            i *= 5;
        }
        System.out.println("The number of trailing zeros in " + n + "! is: " + count);  
        


    }
    
}
