package codingtest.inflearn.dfs;

public class 순열구하기 {
    static int[] arr;
    static int[] newArr;
    static int[] visited;
    public void solution(int N, int M) {
        newArr = new int[M];
        visited = new int[N];
        DFS(N, M, 0);
    }

    public void DFS(int N, int M, int cnt) {
        if(cnt == M) {
            for(int i=0; i<M; i++){
                System.out.print(newArr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<N; i++){
            if(visited[i]==0){
                newArr[cnt] = arr[i];
                visited[i] = 1;
                DFS(N, M, cnt+1);
                visited[i] = 0;
            }
        }

    }
}
