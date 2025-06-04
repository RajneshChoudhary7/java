class MyRunnable implements Runnable {
    public void run() {
        System.out.println("hiiiii");
    }
}


public class runnable {
    public static void main(String[] args) {
        MyRunnable obj  = new MyRunnable();
            Thread t1 = new Thread(obj);
            t1.start();
            // try {
            //     t1.join();
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
            System.out.println("rajnesh in main");
    }
}
