package codingtest.inflearn.dfs;

public class 부분집합구하기 {
    static int[] visited;
    public void solution(int N) {
        visited = new int[N+1];
        DFS(1, N);
    }

    public void DFS(int num, int N) {
        if(num==N+1){
            String temp = "";
            for(int i=1; i<=N; i++){
                if(visited[i]==1) temp += i + " ";
            }
            if(temp.length()>0) System.out.println(temp);
            return;
        }

        visited[num] = 1;
        DFS(num+1, N);
        visited[num] = 0;
        DFS(num+1, N);
    }
}
