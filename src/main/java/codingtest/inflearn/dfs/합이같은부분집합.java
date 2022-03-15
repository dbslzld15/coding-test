package codingtest.inflearn.dfs;

public class 합이같은부분집합 {
    static int[] visited;
    static String answer = "NO";

    public void solution(int N, int[] arr) {
        visited = new int[N];
        DFS(arr, N, 0);
    }

    public void DFS(int[] arr, int N, int level) {
        if(level==N){
            int sum1 = 0, sum2 = 0;

            for(int i=0; i<N; i++){
                if(visited[i]==0) sum1+=arr[i];
                else sum2+=arr[i];
            }

            if(sum1==sum2){
                answer = "YES";
            }
            return;
        }

        visited[level] = 1;
        DFS(arr, N, level+1);
        visited[level] = 0;
        DFS(arr, N, level+1);
    }

    static int n, total;
    static boolean flag = false;
    public void DFS(int L, int sum, int[] arr){ //input (0, 0, arr)
        if(flag) return;
        if(L==n) {
            if(total==2*sum){
                answer = "YES";
                flag=true;
            }
        } else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }
}
