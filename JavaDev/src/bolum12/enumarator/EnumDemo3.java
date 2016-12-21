package bolum12.enumarator;

/**
 * Created by bilalsay on 09.11.2016.
 */
public class EnumDemo3 {

    public static void main(String args[]) {
        Apple ap;

        // Winesap ın fiyatını görüntüle

        System.out.println("Winesap's price: " + Apple.Winesap.getPrice());

        for (Apple a: Apple.values()) {
            System.out.println(a + "'s price: " + a.getPrice());
        }


    }

}
