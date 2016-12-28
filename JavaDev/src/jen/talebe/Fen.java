package jen.talebe;

/**
 * Created by bilalsay on 26.12.2016.
 */
public class Fen extends Ilim {

    private int seviye;

    Fen(String isim, int seviye) {
        isimKoy(isim);
        tipKoy(2);
        this.seviye = seviye;
    }

    public int seviyeGetir() {
        return this.seviye;
    }

    public void arastir(Kainat kainat) {

    }

}
