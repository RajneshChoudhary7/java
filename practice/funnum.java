package practice;
import java.util.Scanner;

public class funnum {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        // sumofn();
        // printeven();
        // numinrev();
        // sum1ton();
        // product();
        // printdigit();
        // sumdigit();
        // countdigit();
        // revdigit();
        palandrom();
        
    }
    
    static void sumofn()
    {
        System.out.println("enter any number to print 1 to n = ");
        int num = sc.nextInt();
        for(int i=0;i<=num;i++)
        {
            System.out.println(i+"  ");
        }
    }

    //////////////////////////////////////////
    static void printeven()
    {
        System.out.println("enter starting number = ");
        int n1=sc.nextInt();
        System.out.println("enter ending number = ");
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+"  ");
            }
        }
    }


    //////////////////////////////////
    static void numinrev()
    {
        System.out.println("enter any number to print in reverse order = ");
        int num = sc.nextInt();
        for(int i=num;i>=1;i--)
        {
            System.out.println(i+"  ");
        }
    }


    /////////////////////////////////////////
    static void sum1ton()
    {
        System.out.println("enter any number to print 1 to n = ");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum+=i;
        }
        System.out.println("sum of all = "+sum);
    }



    static void product ()
    {
        System.out.println("enter any number to print product 1 to n = ");
        int num = sc.nextInt();
        int sum=1;
        for(int i=1;i<=num;i++)
        {
            sum*=i;
        }
        System.out.println("pruduct of all = "+sum);
    }

    static void printdigit()
    {
        System.out.println("enter any number to print digit = ");
        int num = sc.nextInt();
        int rem=0;
        for(int i=0;num!=0;i++)
        {
            rem=num%10;
            System.out.println(rem);
            num=num/10;
        }
    }
    static void sumdigit()
    {
        System.out.println("enter any number to find  digit sum  = ");
        int num = sc.nextInt();
        int rem=0;
        int sum=0;
        for(int i=0;num!=0;i++)
        {
            rem=num%10;
            sum = sum+rem;
            num=num/10;
        }
        System.out.println("sum of digit = "+sum);
    }

    static void countdigit()
    {
        System.out.println("enter any number to find  digit sum  = ");
        int num = sc.nextInt();
        int rem=0;
        int count=0;
        for(int i=0;num!=0;i++)
        {
            rem=num%10;
            count++;
            num=num/10;
        }
        System.out.println("number  of digit = "+count);
    }

    static void revdigit()
    {
        System.out.println("enter any number to find  digit sum  = ");
        int num = sc.nextInt();
        int oldnum=num;
        int rem=0;
        int sum=0;
        for(int i=0;num!=0;i++)
        {
            rem=num%10;
            sum = sum*10+rem;

            num=num/10;
        }
        System.out.println("reverse of digit = "+sum);
    }

    static void palandrom()
    {
        System.out.println("enter any number to find  digit sum  = ");
    int num = sc.nextInt();
    int oldnum=num;
    int rem=0;
    int sum=0;
    for(int i=0;num!=0;i++)
    {
        rem=num%10;
        sum = sum*10+rem;

        num=num/10;
    }
    if(oldnum==sum)
    {
        System.out.println("number is palandrom ");
    }
    else{
        System.out.println("number is not palandrom");
    }

    }

    
}
