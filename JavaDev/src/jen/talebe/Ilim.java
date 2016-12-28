package jen.talebe;

/**
 * Created by bilalsay on 26.12.2016.
 */
abstract class Ilim {

    private String isim;
    private int tip;
    private int durum;

    public void isimKoy(String isim) {
        this.isim = isim;
    }

    public String isimGetir() {
        return this.isim;
    }

    public void tipKoy(int tip) {
        this.tip = tip;
    }

    public int tipGetir() {
        return this.tip;
    }

    public void durumKoy(int durum) {
        this.durum = durum;
    }

    public int durumGetir() {
        return this.durum;
    }

    abstract void arastir(Kainat o);
}
