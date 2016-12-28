package jen.talebe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bilalsay on 26.12.2016.
 */
abstract class Talebe {

    protected String isim;
    protected List<Ilim> tahsilEdilenIlimler;
    protected List<Ilim> tatbikEdilenIlimler;
    protected List<Ilim> tefekkurEdilenIlimler;

    Talebe() {
        tahsilEdilenIlimler = new ArrayList<Ilim>();
        tatbikEdilenIlimler = new ArrayList<Ilim>();
        tefekkurEdilenIlimler = new ArrayList<Ilim>();
    }

    abstract Ilim tahsilEt(Ilim O);
    abstract Ilim tatbikEt(Ilim O);
    abstract Ilim denCenabiHakkinEsmalariniTefekkurEt(Ilim O);
    protected String isimSoyle() {
        return this.isim;
    }
}
