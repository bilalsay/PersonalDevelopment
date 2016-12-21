package threads;

/**
 * Created by bilalsay on 09.10.2016.
 */
public class CurrentThreadDemo {

    public static void main(String args[]) {
        Thread t = Thread.currentThread();

        System.out.println("Current thread: " + t.getState());

        // Kanalın adını değiştir
        t.setName("My Thread");
        System.out.println("After name change: " + t.getState());

        try {

            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("After name change: " + t.getState());
    }
}
