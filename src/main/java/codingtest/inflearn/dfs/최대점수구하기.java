package codingtest.inflearn.dfs;

public class 최대점수구하기 {
    static int[] arr1;
    static int[] arr2;
    static int limit;
    static int N;
    static int answer = 0;

    public void solution() {
        DFS( 0, 0, 0);
    }

    public void DFS(int time, int score, int level) {
        if(time > limit) return;
        if(level == N){
            if(time<=limit) answer = Math.max(answer, score);
            return;
        }

        DFS(time+arr2[level], score+arr1[level], level+1);
        DFS(time, score, level+1);
    }
}
