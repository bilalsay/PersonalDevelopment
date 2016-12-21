package threads;

/**
 * Created by bilalsay on 09.10.2016.
 */
public class ThreadDemo {

    public static void main(String args[]) {
        new NewThread(); // Yeni bir kanal oluştur

        /* Burada da yeni thread tanımlanabilir
        // Yeni ikinci bir kanal oluştur

        Thread t = new Thread(new NewThread(), "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start(); // Kanalı başlat
        */

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
