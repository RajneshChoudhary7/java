package finalpractices;

import java.io.IOException;

public class que16 {
    public static void main(String[] args) {
        
        try
        {
            String str = null;
      System.out.println(str.length());
        }catch(NullPointerException e)
        {
            System.out.println("String is null");
        }
    }
    
}
