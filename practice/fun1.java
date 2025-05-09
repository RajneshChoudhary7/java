package practice;
public class fun1 {

    int a = 5;
    public static void main(String[] args) {

        
        hello obj = new hello();
        obj.sum(5);
        int result = obj.add(5, 10);
        System.out.println("The result of static method is: " + result);
        fun1 obj1= new fun1();
        System.out.println();
    }

}

class hello {
    int sum(int a){
        System.out.println("The sum is: " + a);
        return a;
    }
    int add(int a, int b){
        return a + b;
    }
}
