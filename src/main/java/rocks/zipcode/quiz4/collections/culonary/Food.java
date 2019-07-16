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

    public Map < Class<? extends Spice>, Integer> getSpiceCount() {

        for (Spice s : list
        ) {
            if (!map.containsKey(s.getClass())) {map.putIfAbsent(s.getClass(),1);
            }
            else map.put(s.getClass(), map.get(s.getClass())+1);
        }
        return map;
    }

    public void applySpice(Spice spice) {
        list.add(spice);

    }
}
