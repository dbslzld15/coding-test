package codingtest.inflearn.array;

import java.util.HashSet;
import java.util.Set;

public class 임시반장정하기 {
    private int solution(int n, int[][] arr) {
        int answer = 0;
        int maxStudent = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            Set<Integer> set = new HashSet<>();
            for(int j=0; j<5; j++){
                for(int k=0; k<n; k++){
                    if(arr[i][j] == arr[k][j]) set.add(k);
                }
            }
            if(maxStudent < set.size()-1){
                maxStudent = set.size()-1;
                answer = i+1;
            }
        }
        return answer;
    }
}
