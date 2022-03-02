package codingtest.inflearn.array;

import java.util.ArrayList;
import java.util.List;

public class 뒤집은소수 {
    private int[] solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i : arr) {
            String num = new StringBuffer(Integer.toString(i)).reverse().toString();
            int reverseNum = Integer.parseInt(num);
            int cnt = 0;
            for(int j=1; j<=reverseNum; j++){
                if(reverseNum%j ==0) cnt++;
            }
            if(cnt==2) answer.add(reverseNum);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
