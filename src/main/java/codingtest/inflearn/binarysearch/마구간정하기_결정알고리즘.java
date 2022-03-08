package codingtest.inflearn.binarysearch;

import java.util.Arrays;

public class 마구간정하기_결정알고리즘 {
    private int solution(int N, int M, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = arr[1] - arr[0];
        int rt = arr[N-1] - arr[0];

        while(lt<=rt){
            int mid = (lt + rt) / 2;

            if(count(arr, mid)>= M){
                lt = mid +1;
                answer = mid;
            } else {
                rt = mid -1;
            }
        }

        return answer;
    }

    private int count(int[] arr, int mid) { // 주어진 최대 거리로 몇개의 말을 위치 시킬 수 있는지
        int cnt = 1;
        int pos = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]-pos >= mid){
                cnt++;
                pos = arr[i];
            }
        }

        return cnt;
    }
}
