package threads.communicationbetweenthreads;

/**
 * Created by bilalsay on 10.10.2016.
 */
class Q {

    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }

        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }


    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedeException caught");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }

}
