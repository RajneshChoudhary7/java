package lemdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import practice.sortalgo;

public class que5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(999);
        list.add(1000);
        list.add(1500);
        list.add(1000);
        list.add(2000);
        
        List<Integer> modlist = list.stream().distinct().collect(Collectors.toList());

        List<Integer> modList1 = modlist.stream().filter(n->n>1000).collect(Collectors.toList());

        int data = modList1.stream().reduce(0, (a,b)->a+b);
        System.out.println(data);
    }
    
}
