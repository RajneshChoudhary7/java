package finalpractices;

import java.util.Scanner;

import practice.sumofn;

public class enhancedswitch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter day = ");
            int day = sc.nextInt();
            System.out.println(switch(day));
        }    
}
