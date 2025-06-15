package finalpractices;

import java.util.Scanner;

public class que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string to check last word length = ");
        String word = sc.nextLine();       // FIXED: read full line
        word = word.trim(); 
        System.out.println(word);
        int count=0;
        for(int i=word.length()-1;i>=0;i--){
            
            if(word.charAt(i)!=' '){
                count++;
            }
            else
            {
                break;
            }
        }
        System.out.println("you last word count = "+count);
    }
    
}
