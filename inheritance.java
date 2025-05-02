
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

public class inheritance {
    public static void main(String[] args) {
        department obj= new department(2, "tata", 12, "rajnesh", 1200000)  ;
        obj.showemp();
        obj.showdpt();
    }
    
}
