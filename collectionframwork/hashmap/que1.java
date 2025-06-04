package collectionframwork.hashmap;

import java.util.HashMap;
import java.util.Scanner;

import practice.sumofn;
class que1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character , Integer> map = new HashMap<>();
        System.out.println("enter one string");
        String str = sc.nextLine();
        char [] arr = new char[23];

        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
        
    }
}