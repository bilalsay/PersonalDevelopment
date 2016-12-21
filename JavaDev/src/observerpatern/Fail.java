package observerpatern;

import java.util.Observable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by bilalsay on 13.10.2016.
 */
public class Fail extends Observable implements Runnable {

    public void run() {
        try {
            final InputStreamReader isr = new InputStreamReader(System.in);
            final BufferedReader br = new BufferedReader(isr);

            while (true) {
                String response = br.readLine();
                setChanged();
                notifyObservers(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
