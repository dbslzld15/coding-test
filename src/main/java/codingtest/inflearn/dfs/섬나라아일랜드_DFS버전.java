package codingtest.inflearn.dfs;

public class 섬나라아일랜드_DFS버전 {
    static int[][] arr, visited;
    static int answer = 0;
    static int[] dx = {0, 0, 1, -1, 1, -1, 1, -1};
    static int[] dy = {1, -1, 0, 0, 1, -1, -1, 1};


    public void solution(int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(visited[i][j]==0 && arr[i][j]==1){
                    visited[i][j] = 1;
                    DFS(i, j, N);
                    answer++;
                }
            }
        }
    }

    public void DFS(int x, int y, int N){
        if(x<0 || x>= N || y<0 || y>= N)
            return;

        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<N && ny>=0 && ny<N && arr[nx][ny]==1 && visited[nx][ny]==0){
                visited[nx][ny] = 1;
                DFS(nx, ny, N);
            }
        }
    }
}
