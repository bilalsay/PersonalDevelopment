package threads.communicationbetweenthreads;

/**
 * Created by bilalsay on 10.10.2016.
 */
public class PCFixed {

    public static void main(String args[]) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Press Control-C to stopc");

    }
}
