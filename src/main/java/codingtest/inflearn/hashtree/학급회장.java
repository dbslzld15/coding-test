package codingtest.inflearn.hashtree;

import java.util.HashMap;
import java.util.Map;

public class 학급회장 {
    private String solution(int N, String str) {
        String answer = "";

        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            int cnt = map.getOrDefault(c, 0);
            map.put(c, cnt+1);
        }

        int maxCnt = Integer.MIN_VALUE;
        for (Character character : map.keySet()) {
            int cnt = map.get(character);
            if(cnt>maxCnt){
                answer = String.valueOf(character);
                maxCnt = cnt;
            }
        }

        return answer;
    }
}
