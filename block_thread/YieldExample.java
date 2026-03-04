package block_thread;

public class YieldExample extends Thread {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }

}
