package observerpatern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by bilalsay on 13.10.2016.
 */
public class Meful implements Observer {

    private String mesaj;
    public void update(Observable obj, Object arg) {
        if (arg instanceof String) {
            mesaj = (String) arg;
            System.out.println("\nFiil cevabı: " + mesaj);
        }

    }
}
