package codingtest.inflearn.array;

public class 등수구하기 {
    private int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for(int i=0; i<n; i++){
            int cnt=1;
            for(int j=0; j<n; j++){
                if(i!=j){
                    if(arr[i] < arr[j]) cnt++;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }
}
