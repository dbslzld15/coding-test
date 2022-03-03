package codingtest.inflearn.hashtree;

import java.util.*;

public class K번째큰수 {
    private int solution(int N, int K, int[] arr) { //트리셋 내림차순으로 자동정렬
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    tSet.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int cnt = 0;
        for(int num : tSet){
            cnt++;
            if(cnt == K) return num;
        }
        return -1;
    }

    private int solution2(int N, int K, int[] arr) {
        Set<Integer> numSet = new HashSet<>();

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                for(int k=0; k<N; k++){
                    if(i!=j && j!=k && i!=k){
                        numSet.add(arr[i]+arr[j]+arr[k]);
                    }
                }
            }
        }

        Integer[] answer = new Integer[numSet.size()];
        int i = 0;
        for (Integer num : numSet) {
            answer[i++] = num;
        }

        Arrays.sort(answer, Collections.reverseOrder());

        if(K>=answer.length) return -1;
        else return answer[K-1];
    }
}
