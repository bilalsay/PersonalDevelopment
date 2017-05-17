/**
 * Created by bilalsay on 26/04/2017.
 */
public class Connection {

    private int weight;
    private City city1;
    private City city2;

    Connection(City city1, City city2, int weight) {
        this.city1 = city1;
        this.city2 = city2;
        this.weight = weight;
    }

    public City getCity1() {
        return city1;
    }

    public City getCity2() {
        return city2;
    }

    public int getWeight() {
        return weight;
    }

}
