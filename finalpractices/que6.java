package finalpractices;

public class que6 {

//     "Fizz" if divisible by 3 OR contains '3'

//      "Buzz" if divisible by 5 OR contains '5'

//      Number otherwise (1 to 50)
public static void main(String[] args) {
    


    for (int i = 1; i <= 50; i++) {
    String numStr = String.valueOf(i);
    boolean fizz = i % 3 == 0 || numStr.contains("3");
    boolean buzz = i % 5 == 0 || numStr.contains("5");
    
    if (fizz && buzz) System.out.println("FizzBuzz");
    else if (fizz) System.out.println("Fizz");
    else if (buzz) System.out.println("Buzz");
    else System.out.println(i);

    }
}
    
}
