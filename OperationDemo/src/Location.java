/**
 * Created by bilalsay on 19/02/2017.
 */
public class Location {
    private int x;
    private int y;
    private Object ovner;

    Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void addOvner(Object ovner) {
        this.ovner = ovner;
    }

    public Object getOvner() {
        return this.ovner;
    }


}
