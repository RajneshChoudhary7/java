package practice;
public class reversestring {
    public static void main(String[] args) {
        
        System.out.println("welome to check the string is palandrom or not");
        String str = "nitin";
        String str1 = "";
        for( int i=str.length()-1;i>=0;i--)
        {
            str1 = str1 + str.charAt(i);
        }
        System.out.println("the reverse string is : "+str);
        System.out.println("the reverse string is : "+str1);    
        if(str.equals(str1))
        {
            System.out.println("the string is palandrom ");
        }
        else
        {
            System.out.println("the string is not palandrom ");
        }
        
        
        

    
    }
    
}
