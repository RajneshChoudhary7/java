package collectionframwork.hashmap;
import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("id0", 1);
        map.put("id1", 2);
        map.put("id3", 3);
        map.put("id2", 1);

        System.out.println(map);
        System.out.println(map.get(12));
        System.out.println(map.getOrDefault("id0", 1));
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.forEach((key,value)->{
            System.out.println(key+" = "+value);
        });

    }
    
}
