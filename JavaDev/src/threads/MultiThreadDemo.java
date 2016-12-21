package threads;

/**
 * Created by bilalsay on 09.10.2016.
 */
public class MultiThreadDemo {

    public static void main(String args[]) {
        MultiThread ob1 = new MultiThread("One");
        MultiThread ob2 = new MultiThread("Two");
        MultiThread ob3 = new MultiThread("Three");
        System.out.println("Thread One is alive: " + ob1.t.isAlive());
        System.out.println("Thread Two is alive: " + ob2.t.isAlive());
        System.out.println("Thread Three is alive: " + ob3.t.isAlive());
        System.out.println("state 2: " + ob2.t.getState());

        try {
            // diğer kanalların bitmesini bekle
            System.out.println("Waiting for threads to finish");
            ob1.t.join();

            ob2.t.join();

            ob3.t.join();

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Thread One is alive: " + ob1.t.isAlive());

        System.out.println("Thread Two is alive: " + ob2.t.isAlive());
        System.out.println("Thread Three is alive: " + ob3.t.isAlive());

        System.out.println("Main thread exiting");
    }
}
