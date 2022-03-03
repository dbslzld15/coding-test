package codingtest.inflearn.hashtree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 매출액의종류 {
    private List<Integer> solution(int N, int K, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<K; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer.add(map.size());

        for(int i=K; i<N; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            int removeValue = map.get(arr[i-K]) - 1;
            if(removeValue == 0) map.remove(arr[i-K]);
            else map.put(arr[i-K], removeValue);
            answer.add(map.size());
        }

        return answer;
    }
}
