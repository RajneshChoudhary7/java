package finalpractices;

// public class que2 {
//     // break and continue 
//     // print 1 to 100 but stop on number divisible by 17,
//     public static void main(String[] args) {
        
//         for(int i=1;i<=100;i++){
//             if(i%17==0)
//             {
//                 continue;

//             }
//             else
//             {
//                 System.out.print(i+"   ");
//             }
//         }
//     }
    
// }
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Check if the number is divisible by 17
            if (i % 17 == 0) {
                System.out.println("Stopped at: " + i);
                break; // Exit the loop
            }
            System.out.println(i);
        }
    }
}

