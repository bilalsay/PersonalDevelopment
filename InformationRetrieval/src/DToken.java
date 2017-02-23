import java.util.ArrayList;
import java.util.List;

/**
 * Created by bilalsay on 14/02/2017.
 */
public class DToken {

    private int id;
    private ArrayList<String> tokens;

    DToken(int id) {
        this.id = id;
        tokens = new ArrayList<String>();
    }

    public void addDToken(String token) {
        tokens.add(token);
    }

    public ArrayList<String> getTokens() {
        return tokens;
    }

    public int getDTokenId() {
        return id;
    }

}
