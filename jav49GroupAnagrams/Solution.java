package jav49GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> listConversion = new ArrayList<>(Arrays.asList(strs));
        List<String> tempList = new ArrayList<>();

        // Handle empty strings as a group
        List<String> emptyStrings = new ArrayList<>();
        for (String str : listConversion) {
            if (str.isEmpty()) {
                emptyStrings.add(str);
            }
        }
        if (!emptyStrings.isEmpty()) {
            result.add(emptyStrings);
            listConversion.removeAll(emptyStrings);
        }

        // Process non-empty strings
        while (!listConversion.isEmpty()) {
            String currStr = listConversion.get(0); // Pick the first string
            tempList.add(currStr);
            listConversion.remove(currStr);

            // Compare current string with the remaining strings
            for (int j = 0; j < listConversion.size(); j++) {
                String nextStr = listConversion.get(j);
                if (currStr.length() == nextStr.length() && isAnagram(currStr, nextStr)) {
                    tempList.add(nextStr);
                    listConversion.remove(nextStr);
                    j--; // Adjust index after removal
                }
            }

            // Add the group to the result
            result.add(new ArrayList<>(tempList));
            tempList.clear();
        }

        return result;
    }

    public boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
}
