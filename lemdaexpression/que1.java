package lemdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class que1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        List<Integer> modList = list.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());


        List<Integer> data = modList.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());

        System.out.println("Modded List: " + modList);
        System.out.println("Squared List: " + data);
    }
}
