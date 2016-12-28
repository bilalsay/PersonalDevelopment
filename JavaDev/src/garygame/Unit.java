package garygame;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bilalsay on 28.12.2016.
 */
public class Unit {

    private Map properties;

    public Unit(Integer id) {
        setProperty("id", id);
    }

    public void setProperty(String property, Object value) {
        if (properties == null)
            properties = new HashMap();

        properties.put(property, value);
    }

    public Object getProperty(String property) {
        if (properties == null)
            return null;

        return properties.get(property);
    }
}
