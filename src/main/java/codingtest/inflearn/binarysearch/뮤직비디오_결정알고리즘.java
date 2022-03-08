package codingtest.inflearn.binarysearch;

import java.util.Arrays;

public class 뮤직비디오_결정알고리즘 {
    private int solution(int N, int M, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid)<=M){
                rt = mid-1;
                answer = mid;
            } else {
                lt = mid+1;
            }
        }

        return answer;
    }

    private int count(int[] arr, int mid) { // 주어진 용량에 따라 몇개의 묶음으로 분할되는지
        int cnt = 1, sumNum = 0;

        for(int i=0; i<arr.length; i++){
            sumNum += arr[i];
            if(sumNum > mid){
                cnt++;
                sumNum = arr[i];
            }
        }

        return cnt;
    }
}
