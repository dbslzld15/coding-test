package codingtest.inflearn.slidingwindow;

public class 최대매출 {
    private int solution(int N, int K, int[] arr) { //Sliding window를 이용해 시간복잡도를 줄임 O(N)
        int maxNum;
        int sum = 0;
        for(int i=0; i<K; i++) sum+=arr[i];
        maxNum = sum; // 첫번째 0~K 번까지가 최대일 수 있으므로
        for(int i=K; i<N; i++){
            sum = sum + arr[i] - arr[i-K];
            maxNum = Math.max(maxNum, sum);
        }

        return maxNum;
    }

    private int solution2(int N, int K, int[] arr) { // 오답: 시간초과 O(K(N-K))
        int answer = 0;
        for(int i=0; i<N-K; i++){
            int num = 0;
            for(int j=0; j<K; j++){
                num += arr[i+j];
            }
            if(answer<num) answer=num;
        }
        return answer;
    }
}
