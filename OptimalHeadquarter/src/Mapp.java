import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by bilalsay on 26/04/2017.
 */
public class Mapp {
    private ArrayList<City> visited;
    private ArrayList<Connection> discovered;
    private ArrayList<Connection> paths;
    private City startCity;
    private int totalWeight;

    public ArrayList<City> mapLoad(Object[] lines) {
        ArrayList<City> cities = new ArrayList<> ();
        int length = Integer.parseInt((String) lines[0]);

        for (int i = 1; i <= length; i++) {
            String[] s = ((String)lines[i]).split(" ");

            int firstCityId = Integer.parseInt(s[0]);
            int secondCityId = Integer.parseInt(s[1]);
            int weight = Integer.parseInt(s[2]);

            City city1 = new City(firstCityId);
            City city2 = new City(secondCityId);

            if (!cities.contains(city1)) {

                if (!cities.contains(city2)) {
                    cities.add(city2);
                    cities.get(cities.indexOf(city2)).adConnection(city1, weight);
                } else {
                    city2 = cities.get(cities.indexOf(city2));
                    cities.get(cities.indexOf(city2)).adConnection(city1, weight);
                }

                cities.add(city1);
                cities.get(cities.indexOf(city1)).adConnection(city2, weight);

            } else {
                city1 = cities.get(cities.indexOf(city1));
                if (!cities.contains(city2)) {
                    cities.add(city2);
                    cities.get(cities.indexOf(city2)).adConnection(city1, weight);
                } else {
                    city2 = cities.get(cities.indexOf(city2));
                    cities.get(cities.indexOf(city2)).adConnection(city1, weight);
                }
                cities.get(cities.indexOf(city1)).adConnection(city2, weight);
            }


        }

        return cities;
    }

    public void minPathExecute(City city) {

        visited.add(city);

        for (Connection con: city.getConnections()) {
            if (!visited.contains(con.getCity2()))
                discovered.add(new Connection(city, con.getCity2(), con.getWeight()));

        }

        if (discovered.isEmpty())
            return;

        Connection connection = discovered.stream().min((con1, con2) -> con1.getWeight() - con2.getWeight()).get();
        Integer weight = discovered.stream().filter(con -> !visited.contains(con.getCity2())).collect(Collectors.toSet()).stream().min((con1,con2) -> con1.getWeight() - con2.getWeight()).get().getWeight();

        if (!paths.isEmpty()) {

            if (connection.getCity1().getId() == paths.get(paths.size() - 1).getCity2().getId())
                totalWeight = paths.get(paths.size() - 1).getWeight() + weight;
            else if (startCity.getId() == connection.getCity1().getId())
                totalWeight = weight;
            else if (connection.getCity1().getId() == paths.get(paths.size() - 1).getCity1().getId())
                totalWeight = paths.get(paths.size() - 2).getWeight() + weight;

        } else {
            totalWeight += weight;
        }

        paths.add(new Connection(startCity, connection.getCity2(), totalWeight));
        discovered.removeIf(b -> b.getCity2().getId() == connection.getCity2().getId());
        minPathExecute(connection.getCity2());
    }

    public int getTotalWeight(City startCity) {
        this.startCity = startCity;
        this.totalWeight = 0;
        this.paths = new ArrayList<>();
        this.visited = new ArrayList<>();
        this.discovered = new ArrayList<>();
        minPathExecute(this.startCity);
        int total = 0;
        for (Connection con: paths) {
            total += con.getWeight();
        }

        return total;
    }
}
