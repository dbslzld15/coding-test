package codingtest.inflearn.dfs;

public class 중복순열 {
    static int[] arr;
    public void solution(int N, int M) {
        arr = new int[M];
        DFS(N, M, 0);
    }

    public void DFS(int N, int M, int cnt) {
        if(cnt == M) {
            for(int i=0; i<M; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<N; i++){
            if(arr[cnt]==0){
                arr[cnt] = i+1;
                DFS(N, M, cnt+1);
                arr[cnt]=0;
            }
            // 또는
            //arr[cnt] = i+1;
            //DFS(N, M, cnt+1); 사용
        }

    }
}
