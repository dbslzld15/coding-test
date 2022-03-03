package codingtest.inflearn.twopointer;

public class 연속부분수열 {
    private int solution(int N, int M, int[] arr) {
        int cnt = 0;
        int lt = 0, rt = 0;
        int sumNum = 0;
        while(rt<N) {
            if(sumNum + arr[rt] < M){
                sumNum += arr[rt];
                rt++;
            } else if(sumNum + arr[rt] > M){
                sumNum -= arr[lt];
                lt++;
            } else {
                cnt += 1;
                sumNum -= arr[lt];
                lt++;
            }
        }

        return cnt;
    }

    private int solution2(int N, int M, int[] arr) {
        int cnt = 0;
        int lt = 0;
        int sumNum = 0;

        for(int rt=0; rt<N; rt++){
            sumNum += arr[rt];
            if(sumNum == M) cnt++;
            while(sumNum>=M){
                sumNum -= arr[lt];
                lt++;
                if(sumNum==M) cnt++;
            }
        }

        return cnt;
    }
}
