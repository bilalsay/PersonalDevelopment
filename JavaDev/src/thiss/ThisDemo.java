package thiss;

/**
 * Created by bilalsay on 23.12.2016.
 */
class ThisDemo {
    int a;
    int b;

    ThisDemo(int i, int j) {
        a = i;
        b = j;
    }

    ThisDemo(int i) {
        this(i, i);
    }

    ThisDemo() {
        this(0);
    }


}
