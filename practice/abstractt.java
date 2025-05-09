package practice;
abstract class paymet {
    abstract int pay(int a);
    
    void paysuccess()
    {
        System.out.println("Paymes successful");
    }
}
class Upipayment extends paymet
{
    int pay(int a)
    {
        System.out.println("UPI-"+a);
        return 0;
    }
}
class netbank extends paymet
{
    int pay(int a)
    {
        System.out.println("NetBank-"+a);
        return 0;
    }
    
}
public class abstractt {
    public static void main(String[] args) {
        
        paymet obj = new netbank(); 
            obj.pay(5600000);
            obj.paysuccess();
        paymet objj = new netbank();
        objj.pay(250000);
        objj.paysuccess();


        };
    }
    

