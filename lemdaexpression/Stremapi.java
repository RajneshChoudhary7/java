package lemdaexpression;
import java.util.stream.*;
import java.util.ArrayList;

public class Stremapi {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        final ArrayList<Integer> data = (ArrayList<Integer>) list.stream()
            .map(a -> a * 5)
                .collect(Collectors.toList());

                System.out.println(data);

        ArrayList<Integer> data1 = (ArrayList<Integer>) list.stream()
            .filter(a -> a >2)
                .collect(Collectors.toList());


        System.out.println(data1);

        ArrayList<Integer> data2 = (ArrayList<Integer>) data1.stream()
            .map(a -> a *5)
                .collect(Collectors.toList());

                System.out.println(data2);


        int sum = list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);

        int sum1 = data.stream().reduce(1,(a,b)->a*b);
        System.out.println(sum1);

        int sum2 = list.stream().reduce(1,(a,b)->a*b);
        System.out.println(sum2);

        int max = list.stream().reduce(0,(a,b)->(a>b)?a:b );
        System.out.println(max);
    }
}
