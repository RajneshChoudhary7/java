package finalpractices;
import java.util.*;
public class que15 {
    public static void main(String[] args) {
        String str = "aabbcdde";
        Map<Character ,Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character , Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("first non reapeating charachter : "+entry.getKey());
                break;
            }
        }

    }
    
}
