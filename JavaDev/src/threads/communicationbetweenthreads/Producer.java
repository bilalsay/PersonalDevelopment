package threads.communicationbetweenthreads;

import p1.Protection;

/**
 * Created by bilalsay on 10.10.2016.
 */
class Producer implements Runnable {

    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
