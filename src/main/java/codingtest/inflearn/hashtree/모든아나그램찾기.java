package codingtest.inflearn.hashtree;

import java.util.HashMap;
import java.util.Map;

public class 모든아나그램찾기 {
    private int solution(String str1, String str2) {
        int answer = 0;
        int k = str2.length();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char c : str2.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }

        for(int i=0; i<k; i++){
            map2.put(str1.charAt(i), map2.getOrDefault(str1.charAt(i), 0)+1);
        }

        if(map1.equals(map2)) answer++;

        for(int rt=k; rt<str1.length(); rt++){
            map2.put(str1.charAt(rt), map2.getOrDefault(str1.charAt(rt), 0)+1);
            int cnt = map2.get(str1.charAt(rt - k)) - 1;
            if(cnt == 0) map2.remove(str1.charAt(rt - k));
            else map2.put(str1.charAt(rt-k), cnt);
            if(map1.equals(map2)) answer++;
        }

        return answer;
    }
}
