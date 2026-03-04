package block_thread;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SleepExample sleepExample = new SleepExample();
        sleepExample.start();

        JoinExample t1 = new JoinExample();
        t1.start();
        t1.join();
        System.out.println("Thread is finished");

        YieldExample s1 = new YieldExample();
        YieldExample s2 = new YieldExample();

        s1.start();
        s2.start();
    }

}
