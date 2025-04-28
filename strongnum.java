public class strongnum {

//     A Strong number is one where the sum of the factorials of its digits equals the number itself.
// Example: 145 = 1! + 4! + 5! = 145
    public static void main(String[] args) {
        int num = 145; // Example number
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a Strong number.");
        } else {
            System.out.println(originalNum + " is not a Strong number.");
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    
}
