package finalpractices;

public class que11 {
    public static void main(String[] args) {
        String str= " hello world ";
        str= str.trim();
        int count =0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                count++;
            }

        }
        System.out.println("count of this char = "+count);
    }
    
}
