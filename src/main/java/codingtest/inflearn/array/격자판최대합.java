package codingtest.inflearn.array;

import java.util.ArrayList;
import java.util.List;

public class 격자판최대합 {
    private int solution(int n, int[][] arr) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int j=0; j<arr[0].length; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            list.add(sum1);
            list.add(sum2);
        }

        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<arr.length; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length-i-1];
        }
        list.add(sum1);
        list.add(sum2);

        return list.stream().mapToInt(a->a).max().getAsInt();
    }
}
