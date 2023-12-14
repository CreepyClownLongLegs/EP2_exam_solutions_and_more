import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// A hash map with keys of type 'CelestialSystem' and values of type 'String' corresponding to the
// name of the system.
//
public class Catalog{

    // TODO: declare private variables.
    //  You can use predefined Java classes (e.g. java.util.HashMap).

    HashMap<CelestialSystem, String> map = new HashMap<>();

    // Associates the specified system 'key' with the specified name 'value' in this map.
    // If the map previously contained a mapping for the key, the old value is replaced.
    // Returns the previous value associated with key, or 'null' if there was no mapping for key.
    // Precondition: key != null, value != null.
    public String put(CelestialSystem key, String value) {
        // TODO: implement method.
        if (map.containsKey(key)) {
            String v = map.get(key);
            map.replace(key, value);
            return v;
        }
        map.put(key, value);
        return null;

    }

    // Returns 'true' if this map contains a mapping for the specified key.
    public boolean containsKey(CelestialSystem key) {
        // TODO: implement method.
        return this.map.containsKey(key);

    }

    // Returns the value to which the specified key is mapped,
    // or 'null' if this map contains no mapping for the key.
    public String get(CelestialSystem key) {
        // TODO: implement method.
        Set<CelestialSystem> set = map.keySet();
        Iterator iter = set.iterator();;
        while (iter.hasNext()) {
            CelestialSystem n = (CelestialSystem) iter.next();
            if (n.equals(key)) return map.get(n);
        }

        return null;
    }

    // In this class it is NOT necessary to override methods from 'Object' .
}
