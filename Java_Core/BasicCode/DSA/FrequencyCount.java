package Java_Core.BasicCode.DSA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCount {

    public Map<String, Integer> countFrequency(List<String> fruits){
        Map<String, Integer> frequencyCounter = new HashMap<>();
        for(String s : fruits){
            frequencyCounter.put(s, frequencyCounter.getOrDefault(s,0)+1);
        }
        return frequencyCounter;

    }
}
