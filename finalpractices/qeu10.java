package finalpractices;
public class qeu10 {
    public static void main(String[] args) {
        String str = "level";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome string");
        } else {
            System.out.println("Not a palindrome");
        }

        String str1= "hello";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);

        String str2 = "helllo ";
        char[]  chars = str.toCharArray();
         
    }
    static String reverseRecursive(String str){
            if(str.isEmpty()) return str;
            return reverseRecursive(str.substring(1))+str.charAt(0);
        }
}
