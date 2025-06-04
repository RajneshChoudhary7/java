public class exmaple {
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println( "hiii");
        try {
            Thread.sleep(4000);
        }
        catch (Exception e) {

        }
        System.out.println(" after 4 second");
    }
}
class MyThread extends Thread {
    public void run(){
        System.out.println("helllo ");
    }
}
