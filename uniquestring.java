import java.util.Scanner;

public class uniquestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find unique characters:");
        String str = sc.nextLine();
        String newstr = "";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(newstr.indexOf(ch)==-1){
                newstr+=ch;
            }
        }
        System.out.println("old string is  = "  +str);
        System.out.println("Unique string is: "+newstr);
    }
    
    
}
