package collection.countofelements;

import java.util.HashMap;
import java.util.Map;

public class DemoArray {

    public Map<Integer, Integer> countElements(int[] elements) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int element : elements){
            countMap.put(element,countMap.getOrDefault(element,0)+1);

        }
        return countMap;
    }
}
