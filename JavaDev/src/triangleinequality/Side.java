package triangleinequality;

/**
 * Created by bilalsay on 10.10.2016.
 */
public class Side {

    private int distance;
    private String point1, point2;


    Side(int distance, String point1, String point2) {
        this.distance = distance;
        this.point1 = point1;
        this.point2 = point2;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setPoint1(String name) {
        this.point1 = name;
    }

    public String getPoint1() {
        return this.point1;
    }

    public void setPoint2(String name) {
        this.point2 = name;
    }

    public String getPoint2() {
        return this.point2;
    }


}
