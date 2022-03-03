package codingtest.inflearn.hashtree;

import java.util.HashMap;
import java.util.Map;

public class 아나그램 {
    private String solution(String str1, String str2) {
        String answer = "YES";
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0)+ 1);
        }

        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0)+ 1);
        }

        for (Character c : map2.keySet()) {
            if(map1.get(c) != map2.get(c)){
                answer = "NO";
            }
        }
        return answer;
    }
}
