package threads.communicationbetweenthreads;

/**
 * Created by bilalsay on 10.10.2016.
 */
class Consumer implements Runnable {

    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            q.get();
        }
    }

}
