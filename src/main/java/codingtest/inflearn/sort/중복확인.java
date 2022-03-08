package codingtest.inflearn.sort;

import java.util.Arrays;

public class 중복확인 {
    private String solution(int N, int[] arr) {
        Arrays.sort(arr);

        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1])
                return "D";
        }
        return "U";
    }
}
