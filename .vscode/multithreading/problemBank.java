class WithdrawThread extends Thread {
    static int totalBalance=1000;
    int amount;
    public WithdrawThread(int amount)
    {
        this.amount=amount;

    }

    public void run(){
        if(totalBalance>=amount)
        {
            System.out.println("le re l##d ke = "+amount);
            try{
            Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            totalBalance-=amount;
            System.out.println("your remaining balance "+totalBalance);

        }
        else{
            System.out.println(" ye gareeb es ki ma...#cu...");
        }
    }
}



public class problemBank {
    public static void main(String[] args) {
    WithdrawThread t1 = new WithdrawThread(800);
     WithdrawThread t2 = new WithdrawThread(500);
     t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     t2.start();
    }
}}
