class Shared {
    boolean produced = false;

    public synchronized void produce() {
        while (produced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Producer is producing...");
        produced = true;
        notify(); 
    }

    public synchronized void consume() {
        while (!produced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer is consuming...");
        produced = false;
        notify(); 
    }
}
class Producer extends Thread {
    Shared shared;

    Producer(Shared s) {
        this.shared = s;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            shared.produce();
        }
    }
}

class Consumer extends Thread {
    Shared shared;

    Consumer(Shared s) {
        this.shared = s;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            shared.consume();
        }
    }
}


public class synchronised {

    public static void main(String[] args) {
        Shared shared = new Shared();

        Producer p = new Producer(shared);
        Consumer c = new Consumer(shared);

        p.start();
        c.start();
    }
}

    
    
