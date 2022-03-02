package codingtest.inflearn.array;

public class 소수_에레토스테네스의체 {
    private int solution(int n) {
        int[] arr = new int[n+1];
        int answer = 0;

        for(int i=2; i<arr.length; i++){
            arr[i] = i;
        }

        for(int i=2; i<=n; i++){
            for(int j=2; i*j<=n; j++){
                arr[i*j] = 0;
            }
        }

        for (int i : arr) {
            if(i != 0) answer++;
        }

        return answer;
    }
}
