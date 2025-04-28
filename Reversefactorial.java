public class Reversefactorial {
    public static void main(String[] args) {
        // Reverse Factorial: Given a number, find the integer whose factorial is that number.
        // Input: n
        // Output: x such that x! = n, or "No integer found" if no such x exists.
        // Example: n = 120, Output: 5 (since 5! = 120)
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a number to find its reverse factorial:");
        int n = scanner.nextInt();
        
        int i = 1;
        int fact = 1;
        
        while (fact < n) {
            i++;
            fact *= i;
        }
        System.out.println("Factorial of " + i + " is: " + fact);
        
        if (fact == n) {
            System.out.println("The reverse factorial of " + n + " is: " + i);
        } else {
            System.out.println("No integer found whose factorial is " + n);
        }
        
        scanner.close();
    }
    
}
