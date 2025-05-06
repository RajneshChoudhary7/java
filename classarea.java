import java.util.Scanner;

class findarea {
    double area (double r)
    {
        return(3.14*r*r);
    }
    int area(int len , int witdh)
    {
        return(len*witdh);
    }
    double area(double base , double height)
    {
        return(0.5*base*height);
    }
}

public class classarea {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        findarea obj = new findarea();
        double circle = obj.area(23);
        int retangel =obj.area(12, 34);
        double triange = obj.area(43.3, 23.6);

        System.out.println("area of circle is = "+circle);
        System.out.println("area of rectangel is = "+retangel);
        System.out.println("area of triangel is = "+triange);


    }
    
}
