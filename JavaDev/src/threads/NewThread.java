package threads;

/**
 * Created by bilalsay on 09.10.2016.
 */
public class NewThread implements Runnable {

    NewThread() {
        // Yeni ikinci bir kanal oluştur
        Thread t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start(); // Kanalı başlat
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }

        } catch (InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread");
    }
}
