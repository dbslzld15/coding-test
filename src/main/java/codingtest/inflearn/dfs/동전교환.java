package codingtest.inflearn.dfs;

import java.util.Arrays;

public class 동전교환 {
    static int answer = Integer.MAX_VALUE;

    public void solution(int N, int[] arr, int price) {
        Arrays.sort(arr);
        DFS(N, arr, price, 0);
    }

    public void DFS(int N, int[] arr, int price, int cnt) {
        if(cnt >= answer) return;
        if(price < 0) return;
        if(price == 0) {
            answer = Math.min(answer, cnt);
            return;
        }

        for(int i=N-1; i>=0; i--){
            DFS(N, arr, price-arr[i], cnt+1);
        }
    }
}
