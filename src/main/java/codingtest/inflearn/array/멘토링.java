package codingtest.inflearn.array;

public class 멘토링 {
    private int solution(int[][] arr, int N, int M) {
        int answer = 0;

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(i==j) continue;
                int cnt = 0;
                for(int k=0; k<M; k++){
                    int pos1 = 0;
                    int pos2 = 0;
                    for(int s=0; s<N; s++){
                        if(arr[k][s]==i) pos1=s;
                        if(arr[k][s]==j) pos2=s;
                    }
                    if(pos1>pos2) cnt ++;
                }
                if(cnt==M) answer++;
            }
        }

        return answer;
    }
}
