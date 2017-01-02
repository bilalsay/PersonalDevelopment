package subway;

/**
 * Created by bilalsay on 30.12.2016.
 */
public class Station {

    private String name;

    Station(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Station) {
            Station otherStation = (Station) obj;
            if (otherStation.getName().equalsIgnoreCase(this.getName()))
                return true;
        }
        return false;
    }

    public int hashCode() {
        return this.getName().toLowerCase().hashCode();
    }
}
