import java.util.Scanner;

public class stringtochararr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert to character array:");
        String str = sc.nextLine();
        char[] ch= str.toCharArray();
        System.out.println("Character array is:");


        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
        System.out.println();

        for(int i=0;i<ch.length;i++){
            if(ch[i]==ch[i+1]){
                System.out.println("Repeated character is: "+ch[i]);
                break;
            }
        }
    }
}
