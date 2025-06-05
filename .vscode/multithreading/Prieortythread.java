class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(getName()+" is running with priorty ");
            Thread.yield();
        }
    }
}

public class Prieortythread {
    public static void main(String[] args) {
    

        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        t1.setName(" T1 High");
        t2.setName(" T2 Low");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

    }
}
