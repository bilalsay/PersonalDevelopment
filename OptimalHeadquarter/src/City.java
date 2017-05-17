import java.util.ArrayList;

/**
 * Created by bilalsay on 26/04/2017.
 */
public class City {
    private int id;
    private ArrayList<Connection> connections;

    City(int id) {
        this.id = id;
        this.connections = new ArrayList<>();
    }

    public void adConnection(City city, int weight) {
        connections.add(new Connection(this, city, weight));
    }

    public int getId() {
        return id;
    }

    public ArrayList<Connection> getConnections() {
        return connections;
    }

    @Override
    public boolean equals(Object o) {
        if (this.getId() == ((City) o).getId())
            return true;
        return false;
    }

}
