package practice;
public class repeatedchar {
    public static void main(String[] args) {
        // Repeated Character: Given a string, find the first character that appears more than once.
        // Input: "hello"
        // Output: 'l' (since 'l' is the first character that appears more than once)
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a string to find the first repeated character:");
        String str = sc.nextLine();
        
        char repeatedChar = '\0'; 
        boolean found = false;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch, i + 1) != -1) {
                repeatedChar = ch;
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("The first repeated character is: " + repeatedChar);
        } else {
            System.out.println("No repeated characters found.");
        }
        
        sc.close();
    }
    
}
