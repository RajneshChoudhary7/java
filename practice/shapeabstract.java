package practice;
abstract class shape {
    abstract int area(int r,int l);
    void show()
    {
        System.out.println("abstract method closed ");
    }
}

class circle extends shape
{
    int area(int r,int pi){
        System.out.println("area of circle is = "+(3.14*r*r));
        return 0;
    }
}
class rectangle  extends shape
{
    int area(int len, int wid)
    {
        System.out.println("area of reactangle = "+(len*wid));
        return 0;
    }
}

public class shapeabstract {
    public static void main(String[] args) {
        shape obj = new circle();
        obj.area(23, 1);
        obj.show();

        shape objj = new rectangle();
        objj.area(12,23);
        objj.show();

    }
    
}
