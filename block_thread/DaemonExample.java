package block_thread;

public class DaemonExample extends Thread {

    public void run() {
        while (true) {
            System.out.println("Daemon Thread is running ...");
        }
    }

    public static void main(String[] args) {
        DaemonExample t1 = new DaemonExample();
        t1.setDaemon(true);

        t1.start();

        System.out.println("Main thread ends");
    }

}
