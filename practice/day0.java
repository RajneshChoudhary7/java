package practice;
import java.util.Scanner;
class student  {
int age = 0;
void data(){
    System.out.println(this);
}

    
}
class teacher 
{
    int age ;
    teacher(int age)
    {
        this.age = age;
    }
    void show ()
    {
        System.out.println(age);
    }
}


public class day0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student obj = new student();
        System.out.println(obj);
        obj.data();
        System.out.println(obj.age);

        /////////////////////////////
        teacher obj2 = new teacher(34);
        obj2.show();

    }
    
}
