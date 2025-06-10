
public class traditionnal {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run(){
            System.out.println("this is traditional method");
            }
        };

        r.run();
    }
    
}
