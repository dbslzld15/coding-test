package codingtest.inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class 공주구하기 {
    private int solution(int N, int M) {
        int answer;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=N; i++){
            queue.offer(i);
        }
        int cnt = 0;
        while(queue.size()!=1){
            cnt++;
            if(cnt==M){
                queue.poll();
                cnt = 0;
            } else {
                queue.offer(queue.poll());
            }
        }
        answer = queue.poll();
        return answer;
    }

    private int solution2(int N, int M) {
        int answer = 0;
        int removedCnt = 0;
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }

        int i = 0;
        int cnt = 0;
        while(removedCnt != N-1){
            if(arr[i%N]==0){
                i++;
                continue;
            }
            cnt++;
            if(cnt == M) {
                arr[i%N] = 0;
                cnt = 0;
                removedCnt++;
            }
            i++;
        }

        for(int j=0; j<N; j++){
            if(arr[j]!=0) answer=arr[j];
        }

        return answer;
    }
}
