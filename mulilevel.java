class Employee 
{
    int eno ;
    String ename;
    int salary;
    Employee(int eno, String ename, int salary)
    {
        this.eno=eno;
        this.ename=ename;
        this.salary=salary;
    }
    void showemp()
    {
        System.out.println("employee no = " + eno);
        System.out.println("employee name = " + ename);
        System.out.println("employee salary = " + salary);
    }

}

class department extends Employee {

    int dno;
    String dname;
    department(int dno,String dname , int eno,String ename,int salary)
    {
        super(eno, ename, salary);
        this.dno=dno;
        this.dname=dname;
        
    }
    void showdpt()
    {
        System.out.println("dipartment name = "+dname);
        System.out.println("dipartment no = "+dno);
    }

}

class ceo extends department
{
    ceo(int dno,String dname , int eno,String ename,int salary)
    {
        super(dno, dname, eno, ename, salary);
    }
    void showceo()
    {
        System.out.println("this ceo is Rajnesh choudhary cheaf executive officer ");
    }
}


public class mulilevel {
    public static void main(String[] args) {
        ceo obj = new ceo(3, "maruti", 4, "khwaja", 250000);
        obj.showceo();
        obj.showemp();
        obj.showdpt();
    }
    
}
