class runnable{
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
        System.out.println("this is main class");
         System.out.println("Current thread: " + Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread is running...");
         System.out.println("Current thread: " + Thread.currentThread().getName());
    }
}