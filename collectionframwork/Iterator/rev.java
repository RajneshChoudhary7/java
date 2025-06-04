package collectionframwork.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

import practice.sumofn;

public class rev {
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
            System.out.println(ele);
            
        }

        System.out.println("pree values ----------------");
        while (it.hasPrevious()) {
            String hasvalue = it.previous();
            System.out.println(hasvalue);
            
        }

    }
    
}
