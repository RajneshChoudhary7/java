package practice;
import java.util.Scanner;
class parent{
    void sun(int a)
    {
        System.out.println("don no = "+a);
    }

    void sun(int a , int b)
    {
        System.out.println("sum of a and b = "+(a+b));
    }
}
class father extends parent{
    @override
    void sun(int a)
    {
        System.out.println("don pagal h "+a);
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        parent obj = new parent();
        father obj1 = new father();
        obj1.sun(45);
        obj.sun(23, 34);
        


    }
    
}
