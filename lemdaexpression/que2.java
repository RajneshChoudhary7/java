package lemdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class que2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList();
        list.add("Ram");
        list.add("Shyam");
        list.add("Om");
        list.add("Sita");

        List<String> modlist = list.stream().filter(n->n.length()>3).collect(Collectors.toList());
        System.out.println(modlist);
        // List<String> finalList = modlist.stream().map(null)
    }
    
}
