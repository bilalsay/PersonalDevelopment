package triangleinequality;

/**
 * Created by bilalsay on 10.10.2016.
 */
public class TriangleCreater {

    public static void main(String args[]) {

        Side side1 = new Side(843, "Eskişehir", "Giresun");
        Side side2 = new Side(727, "Giresun", "Adana");
        Side side3 = new Side(688, "Adana", "Eskişehir");

        TriangleR triangle = new TriangleR(side1, side2, side3);

        System.out.println(triangle.getSide3().getPoint1());
    }
}
