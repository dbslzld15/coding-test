package codingtest.inflearn.dfs;

public class 조합_재귀_메모이제이션 {
    static int[][] dy = new int[35][35];
    public int DFS(int n, int r) { //조합 재귀
        if(n==r || r==0) return 1;
        else return DFS(n-1, r-1) + DFS(n-1, r);
    }

    public int DFS2(int n, int r) { //조합 메모이제이션
        if(dy[n][r] != 0) return dy[n][r];
        if(n==r || r==0) return dy[n][r] = 1;
        else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }
}
