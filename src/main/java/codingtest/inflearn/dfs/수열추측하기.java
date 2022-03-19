package codingtest.inflearn.dfs;

public class 수열추측하기 {
    static int[][] dy = new int[35][35];
    static int arr1[];
    static int arr2[];
    static int[] visited;
    static String answer = "";
    static boolean flag = false;

    private void solution(int n, int m) {
        visited = new int[n];
        arr1 = new int[n];
        arr2 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = combination(n-1, i);
        }
        DFS(n, 0, m);
    }

    public void DFS(int n, int level, int target){
        if(flag) return;
        if(level==n){
            int sum = 0;
            for(int i=0; i<n; i++){
                sum += arr2[i] * arr1[i];
            }
            if(sum == target){
                for(int i=0; i<n; i++) answer += arr2[i] + " ";
                flag = true;
            }
            return;
        }

        for(int i=1; i<=n; i++){
            if(visited[i-1]==0){
                visited[i-1] = 1;
                arr2[level] = i;
                DFS(n, level+1, target);
                visited[i-1] = 0;
            }
        }
    }

    public void DFS2(int n, int level, int target, int sum){
        if(flag) return;
        if(level==n){
            if(sum == target){
                for(int i=0; i<n; i++) answer += arr2[i] + " ";
                flag = true;
            }
            return;
        }

        for(int i=1; i<=n; i++){
            if(visited[i-1]==0){
                visited[i-1] = 1;
                arr2[level] = i;
                DFS2(n, level+1, target, sum + (arr1[i] * arr2[i]));
                visited[i-1] = 0;
            }
        }
    }

    public int combination(int n, int r) { //조합 메모이제이션
        if(dy[n][r] != 0) return dy[n][r];
        if(n==r || r==0) return dy[n][r] = 1;
        else return dy[n][r] = combination(n-1, r-1) + combination(n-1, r);
    }
}
