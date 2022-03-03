package codingtest.inflearn.twopointer;

public class 연속된자연수의합 {
    private int solution(int N) {
        int answer = 0;
        int sumNum = 0, lt=1;
        for(int rt=1; rt<=N/2+1; rt++){
            sumNum += rt;
            if(sumNum == N) answer++;
            while(sumNum > N){
                sumNum -= lt;
                lt++;
                if(sumNum == N) answer++;
            }
        }

        return answer;
    }
}
