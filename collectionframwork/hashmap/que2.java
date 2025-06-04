package collectionframwork.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , Integer> map = new HashMap<>();
        System.out.println("enter one string =");
        String str = sc.nextLine();
        String [] newstr=str.split(" ");

        for(String ch : newstr){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
        
    }
}
