
public class main {
    public static void main(String[] args) {

        System.out.println("hello world");

        Thread1 th = new Thread1();
        th.start();
        System.out.println(th.getName());

        Thread1 th1 = new Thread1();
        th1.start();
        System.out.println(th1.getName());

    }
}