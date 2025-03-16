
public class main {
    public static void main(String[] args) {

        System.out.println("hello world");

        // making obj of Thread1 class which is extend to thread class
        Thread1 th = new Thread1();
        th.start();
        System.out.println(th.getName());

        Thread1 th1 = new Thread1();
        th1.start();
        System.out.println(th1.getName());

        // making obj of Thread1 class which is implements to Runnable class
        Thread2 th2 = new Thread2();
        Thread t = new Thread(th2);
        t.start();
        System.out.println(t.getName());
    }
}