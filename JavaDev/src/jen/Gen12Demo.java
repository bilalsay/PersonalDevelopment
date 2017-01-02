package jen;

/**
 * Created by bilalsay on 29.12.2016.
 */

class Gen1<T> {

    T ob;

    Gen1(T o) {
        this.ob = o;
    }

    T getOb() {
        return this.ob;
    }
}

class Gen2<T, V> extends Gen1<T> {
    V ob2;
    Gen2(T o, V o2) {
        super(o);
        this.ob2 = o2;
    }

    V getOb2() {
        return this.ob2;
    }
}


public class Gen12Demo {

    public static void main(String args[]) {
        // String ve Integr için bir Gen2 nesnes oluştur
        Gen2<String, Integer> x = new Gen2<String, Integer>("Value is: ", 99);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
