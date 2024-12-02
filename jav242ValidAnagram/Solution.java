package jav242ValidAnagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Integer, Integer> counter = new HashMap<>();
        //input Ascii value as their Unicode with count in counter hashmap
        for (int i = 0; i < s.length(); i++) {
            int currentCh = s.codePointAt(i);
            counter.put(currentCh, counter.getOrDefault(currentCh, 0) + 1);
        }

        //compare each character in string t against counter
        for (int j = 0; j < t.length(); j++) {
            int compareCh = t.codePointAt(j);
            if (!counter.containsKey(compareCh)) {
                return false;
            }
            //If character found in counter it decrements the value
            counter.put(compareCh, counter.get(compareCh) - 1);
            //If value reaches 0 meaning perfect match of characters count then removes it from hashmap
            if (counter.get(compareCh) == 0) {
                counter.remove(compareCh);
            }
        }
        //if perfect match then Hashmap should be empty
        return counter.isEmpty();
    }
}
