package finalpractices;
import java.util.*;
public class que14 {

    public static void main(String[] args) {
        String sentence = " java is fun and java is powerful";
        sentence.trim();
        String[] words = sentence.split(" ");
        Map<String ,Integer> freMap = new HashMap<>();
        for(String word : words){
            freMap.put(word, freMap.getOrDefault(word, 0)+1);

        }
        System.out.println("word freq count "+freMap);
    }
}