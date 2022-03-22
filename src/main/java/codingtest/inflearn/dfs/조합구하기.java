package codingtest.inflearn.dfs;

public class 조합구하기 {
    static int N, M;
    public void dfs(int level, int num, int[] arr) {
        if(level == M) {
            for(int i=0; i<M; i++) System.out.print(arr[i] + " ");
            System.out.println();
            return;
        }

        for(int i=num; i<=N; i++){
            arr[level] = i;
            dfs(level+1, i+1, arr);
        }
    }
}
