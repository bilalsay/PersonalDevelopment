package jen.talebe;

/**
 * Created by bilalsay on 26.12.2016.
 */
public class Medrese {
    public static void main(String args[]) {
        Ilim hasir = new Iman("Haşir");
        Ilim kader = new Iman("Kader");
        Ilim matematik = new Fen("Matematik", 1);
        Ilim fizik = new Fen("Fizik", 3);
        Ilim fizik1 = new Fen("Fizik1", 4);

        Talebe ali = new IlkokulTalebesi("Ali");
        Talebe veli = new UniversiteTalebesi("Veli");
        Talebe hasan = new LiseTalebesi("Hasan");

        System.out.println(ali.denCenabiHakkinEsmalariniTefekkurEt(ali.tatbikEt(ali.tahsilEt(hasir))).durumGetir());


    }
}
