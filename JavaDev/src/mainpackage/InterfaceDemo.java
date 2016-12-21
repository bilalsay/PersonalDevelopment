package mainpackage;

/**
 * Created by bilalsay on 08.10.2016.
 */

class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
}

public class InterfaceDemo {

    public static void main(String args[]) {
        Client client = new Client();
        client.callback(12);
    }

}
