package collectionframwork.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ques1 {
    private static final char[] ele = null;

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rajnesh");
        names.add("Ajju");
        names.add("sonam");
        names.add("priya");
        names.add("Amit");
        ListIterator<String> it = names.listIterator();
        while (it.hasNext()) {
            String ele = it.next();
            if(ele.length()<=4)
            {
                it.set("byee");
            }

            
        }
        
        System.out.println(names);

       

        System.out.println("pree values ----------------");

        int count=0;
        while (it.hasPrevious()) {
            String ele = it.previous();
            count++;
            if(count != names.size())
            {
                it.set("hello");
            }
            
        }
        System.out.println(names);
    }
}
