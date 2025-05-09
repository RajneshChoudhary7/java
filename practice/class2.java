package practice;
import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rajnesh obj = new rajnesh("king ", 20, 100000000);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.salary);

    }
    
}
class  rajnesh {
    String name="shekh khwaja";
    int age=99;
    int salary=123000 ;
    rajnesh(String name, int age, int salary)
    {  
        this.name = name;
        this.age =age;
        this.salary =salary;

        System.out.println("welcome Mr "+name+"your age is "+age+" and you salary is = "+salary);

    }

    
}
