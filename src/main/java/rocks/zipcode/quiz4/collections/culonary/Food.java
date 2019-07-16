package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> list = new ArrayList<>();

    private Map < Class<? extends Spice>, Integer> map = new HashMap<>();

    public List<Spice> getAllSpices() {
        return list;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

//        for (Spice s : list
//        ) {
//            if (!map.containsKey(s)) {map.putIfAbsent((s,1);
//            }
//            else map.put(s ,map.get(s)+1);
//        }
        return (Map<SpiceType, Integer>) map;
//            return null;
    }

    public void applySpice(Spice spice) {
        list.add(spice);

    }
}
