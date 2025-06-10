package lemdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class que4 {
    public static void main(String[] args) {
        
  
    ArrayList<String> list = new ArrayList();
    list.add("java");
    list.add("Stream");
    list.add("API");

    List<Integer> modList = list.stream().map(n->n.length()).collect(Collectors.toList());
    System.out.println(modList);
    
    }
}
