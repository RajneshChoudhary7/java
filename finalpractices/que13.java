package finalpractices;
import java.util.*;
public class que13 {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character,Integer> freqMap = new HashMap<>();

        for( char ch : str.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch,0 )+1);
        }
        System.out.println("char freq : "+freqMap);
        }
    }
    

