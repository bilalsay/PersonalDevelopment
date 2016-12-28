package jen.talebe;

import java.util.ArrayList;

/**
 * Created by bilalsay on 26.12.2016.
 */
public class UniversiteTalebesi extends Talebe implements TalebeninMahiyeti {

    UniversiteTalebesi(String isim) {
        super.isim = isim;
    }

    public Ilim tahsilEt(Ilim ilim) {
        ilim.durumKoy(1);
        tahsilEdilenIlimler.add(ilim);
        return ilim;
    }

    public Ilim tatbikEt(Ilim ilim) {
        if (ilim.durumGetir() == 1) {
            ilim.durumKoy(2);
            tatbikEdilenIlimler.add(ilim);
        }
        return ilim;
    }

    public Ilim denCenabiHakkinEsmalariniTefekkurEt(Ilim ilim) {
        if (ilim.durumGetir() == 2) {
            ilim.durumKoy(3);
            tatbikEdilenIlimler.add(ilim);
        }

        return ilim;
    }
}
