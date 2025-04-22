public class findfreqfostring {
    public static void main(String[] args) {
        String str = "hello world hello";
        String str1 = "hello";
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.indexOf(str1,i)==i)
            {
                count++;
                i += str1.length()-1;
            }
        }
        System.out.println("the frequency of the string is : "+count);
    }
    
}
