package triangleinequality;

/**
 * Created by bilalsay on 10.10.2016.
 */
public class TriangleR {

    private Side side1, side2, side3;

    TriangleR(Side side1, Side side2, Side side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(Side side1) {
        this.side1 = side1;
    }

    public Side getSide1() {
        return side1;
    }

    public void setSide2(Side side2) {
        this.side2 = side2;
    }

    public Side getSide2() {
        return side2;
    }

    public void setSide3(Side side3) {
        this.side3 = side3;
    }

    public Side getSide3() {
        return side3;
    }
}
