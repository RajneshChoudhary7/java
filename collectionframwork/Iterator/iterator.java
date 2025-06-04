package collectionframwork.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

import practice.sumofn;

public class iterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rajnesh");
        names.add("Ajju");
        names.add("sonam");
        names.add("priya");
        names.add("Amit");

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String elem = it.next();
            System.out.println(elem);
            if(elem.startsWith("a")){
            it.remove();
            }
        }
        System.out.println(names);
    }
    
    
}
