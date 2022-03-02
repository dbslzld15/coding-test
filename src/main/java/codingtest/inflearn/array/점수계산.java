package codingtest.inflearn.array;

public class 점수계산 {
    private int solution(int n, int[] arr) {
        int answer = 0;
        int correct = 1;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                answer += correct;
                correct++;
            } else {
                correct = 1;
            }
        }

        return answer;
    }
}
