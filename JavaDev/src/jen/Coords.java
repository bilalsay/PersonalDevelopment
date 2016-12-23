package jen;

/**
 * Created by bilalsay on 23.12.2016.
 */

class TwoD {
    int x,y;
    TwoD(int a, int b) {
        this.x = a;
        this.y = b;
    }
}

class ThreeD extends TwoD {
    int z;
    ThreeD(int a, int b, int c) {
        super(a, b);
        this.z = c;
    }
}

class FourD extends ThreeD {
    int t;
    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        this.t = d;
    }
}

class Coords<T extends TwoD> {

    T[] coords;

    Coords(T[] o) {
        this.coords = o;
    }

}
