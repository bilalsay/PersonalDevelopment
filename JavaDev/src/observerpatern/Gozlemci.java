package observerpatern;

/**
 * Created by bilalsay on 13.10.2016.
 */
public class Gozlemci {

    public static void main(String args[]) {
        System.out.println("Fiil > ");
        final Fail failNesnesi = new Fail();
        final Meful mefulNesnesi = new Meful();

        failNesnesi.addObserver(mefulNesnesi);

        Thread newThread = new Thread(failNesnesi);
        newThread.start();
    }
}
