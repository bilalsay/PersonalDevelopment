package bolum12.enumarator;

/**
 * Created by bilalsay on 09.11.2016.
 */
public class EnumDemo {

    public static void main(String args[]) {
        Apple ap;
        ap = Apple.RedDel;
        // Bir enum değerini çıktıya ver

        System.out.println("Value of ap : " + ap.ordinal());
        ap = Apple.GoldenDel;

        Apple appp = Apple.RedDel;
        if (ap.compareTo(appp) < 0)
            System.out.println("ap , appp den önce geliyor");


        if (ap.compareTo(appp) > 0)
            System.out.println("ap , appp den sonra geliyor");


        if (ap.compareTo(appp) == 0)
            System.out.println("ap , appp ye eşit");

        // İki enum değerini karşılaştır
        if (ap == Apple.GoldenDel)
            System.out.println("ap contains GoldenDel");

        // Bir switch ifadesini kontrol etmek için enum kullan
        switch(ap) {
            case Jonathan:
                System.out.println("Jonathan is red");
                break;
            case GoldenDel:
                System.out.println("GoldenDel Delicious is yellow ");
                break;
            case RedDel:
                System.out.println("Red Delicious is red");
                break;
            case Winesap:
                System.out.println("Winesap is red");
                break;
            case Cortland:
                System.out.println("Cortland is red. ");
                break;
        }

        // values methodu Apple enumaraterinin içindeki sabitlerin listesini verir
        for (Apple a: Apple.values()) {
            System.out.println(a);

        }

        String s = Apple.valueOf("Winesap") instanceof Apple ? "doğru" : "yalnış";
        System.out.println(s);




    }

}
