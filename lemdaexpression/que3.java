package lemdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class que3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> modlist = list.stream().filter(n->n%2!=0).collect(Collectors.toList());

        int data = modlist.stream().reduce(0,(a,b)->a+b);
        System.out.println(data);


    }
    
}
