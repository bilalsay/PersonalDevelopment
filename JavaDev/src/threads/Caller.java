package threads;

/**
 * Created by bilalsay on 09.10.2016.
 */
class Caller implements Runnable {

    String msg;
    Callme target;
    Thread t;

    Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        target.call(msg);
    }
}
