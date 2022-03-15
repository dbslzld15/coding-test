package codingtest.inflearn.dfs;

public class 바둑이승차 {
    static int[] visited;
    static int answer = 0;

    public void solution(int limit, int M, int[] arr) {
        visited = new int[M];
        DFS(arr, limit, M,0);
    }

    public void DFS(int[] arr, int limit, int M, int level) {
        if(level==M){
            int sumNum = 0;
            for(int i=0; i<M; i++){
                if(visited[i]==1){
                    sumNum += arr[i];
                }
            }
            if(sumNum <= limit) answer = Math.max(sumNum, answer);
            return;
        }

        visited[level] = 1;
        DFS(arr, limit, M, level+1);
        visited[level] = 0;
        DFS(arr, limit, M, level+1);
    }

    public void DFS2(int[] arr, int limit, int M, int level, int sum) {
        if(level==M){
            if(sum <= limit) answer = Math.max(sum, answer);
            return;
        }

        DFS2(arr, limit, M, level+1, sum + arr[level]);
        DFS2(arr, limit, M, level+1, sum);
    }
}
