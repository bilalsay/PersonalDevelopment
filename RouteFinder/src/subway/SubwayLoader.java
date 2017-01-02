package subway;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by bilalsay on 30.12.2016.
 */
public class SubwayLoader {

    private Subway subway;

    SubwayLoader() {
        this.subway = new Subway();
    }

    public Subway loadFromFile(String subwayFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(subwayFile));
        this.loadStation(this.subway, reader);

        String lineName = reader.readLine();

        while ((lineName != null) && (lineName.length() > 0)) {
            this.loadLine(this.subway, reader, lineName);
            lineName = reader.readLine();
        }
        return this.subway;
    }

    public void loadStation(Subway subway, BufferedReader reader) throws IOException {
        String currentLine = reader.readLine();
        while (currentLine.length() > 0) {
            subway.addStation(currentLine);
            currentLine = reader.readLine();
        }
    }

    public void loadLine(Subway subway, BufferedReader reader, String lineName) throws IOException {

        String station1Name, station2Name;

        station1Name = reader.readLine();
        station2Name = reader.readLine();
        while ((station2Name != null) && (station2Name.length() > 0)) {
            subway.addConnection(station1Name, station2Name, lineName);
            station1Name = station2Name;
            station2Name = reader.readLine();
        }

    }
}
