package codingtest.inflearn.twopointer;

public class 최대길이연속부분수열 {
    private int solution(int N, int M, int[] arr) {
        int maxLen = Integer.MIN_VALUE;
        int zeroCnt = 0, lt = 0;

        for(int rt=0; rt<N; rt++){
            if(arr[rt]==0){
                zeroCnt++;
            }
            if(zeroCnt>M){
                maxLen = Math.max(maxLen, rt-lt);
                while(arr[lt]!=0){
                    lt++;
                }
                lt++;
                zeroCnt--;
            }
        }
        return maxLen;
    }

    private int solution2(int N, int M, int[] arr) {
        int maxLen = Integer.MIN_VALUE;
        int zeroCnt = 0, lt = 0;

        for(int rt=0; rt<N; rt++){
            if(arr[rt]==0) zeroCnt++;
            while(zeroCnt>M){
                if(arr[lt]==0) zeroCnt--;
                lt++;
            }
            maxLen = Math.max(maxLen, rt-lt+1);
        }
        return maxLen;
    }
}
