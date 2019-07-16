package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private String[] strings;
    HashMap<String, Integer> map = new HashMap<>();

    public WordCounter(String... strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getWordCountMap() {

        for (String s : strings
             ) {
            if (!map.containsKey(s)) {map.putIfAbsent(s,1);
            }
            else map.put(s,map.get(s)+1);
        }
        return map;
    }
}
