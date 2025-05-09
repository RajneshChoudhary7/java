package practice;
public class factevenodd {
    public static void main(String[] args) {
        
        // 8. Check if the factorial of n is even or odd

        // Input: n
        // Output: "Even" or "Odd"
        // Example: n = 5, Output: "Even" (since 5! = 120, which is even)
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a number to find its factorial and check if it's even or odd:");
        int n = scanner.nextInt();      
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + n + " is: " + fact);
        if (fact % 2 == 0) {
            System.out.println("The factorial is even.");
        } else {
            System.out.println("The factorial is odd.");
        }
        scanner.close();
    }
    
}
