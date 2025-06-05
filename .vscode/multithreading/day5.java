public class day5 {
    public static void main(String[] args) {
        System.out.println("this is main class ");
        Thread t1 = new Thread(() -> {
            System.out.println("this is your first thread ");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("this is after thread");
        });
        

        Thread t2 = new Thread(() -> {
            System.out.println("this is your second thread");
        });
        

        ////////////////////
        Thread t3 = new Thread(() -> {
            System.out.println("this is your Third thread");
        });

        
        t1.start();
        t2.start();
        t3.start();
        t1.setPriority(Thread.MIN_PRIORITY);

        t2.setPriority(Thread.MAX_PRIORITY);

        t3.setPriority(1);

    }

}
