package codingtest.inflearn.array;

import java.util.ArrayList;
import java.util.List;

public class 큰수출력하기 {
    private int[] soulution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]){
                answer.add(arr[i]);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
