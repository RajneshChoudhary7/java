package dsaquestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class q6 {
    public static void unionIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> union = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();
        
        for (int num : arr1) set.add(num);
        for (int num : arr2) {
            if (set.contains(num)) {
                intersection.add(num);
                set.remove(num);
            }
        }
        
        set.clear();
        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);
        union.addAll(set);
        
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
