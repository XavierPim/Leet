package jav49GroupAnagrams;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String[] strs = {
//                "eat",
//                "tea",
//                "tan",
//                "ate",
//                "nat",
//                "bat"};
        String[] strs = {"","b"};
//        String[] strs = {"",""};
        Solution solution = new Solution();
        List<List<String>> result = solution.groupAnagrams(strs);
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
