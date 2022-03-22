package codingtest.inflearn.dfs;

public class 미로탐색 {
    static int[][] arr;
    static int cnt = 0;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] visited;
    private void solution() {
        visited[0][0] = 1;
        dfs(0, 0);
    }

    public void dfs(int x, int y) {
        if(x>=7 || x < 0) return;
        if(y>=7 || y < 0) return;

        if(x==6 && y==6){
            cnt++;
            return;
        }

        for (int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<7 && ny>=0 && ny<7){
                if(arr[nx][ny]==0 && visited[nx][ny]==0){
                    visited[nx][ny] = 1;
                    dfs(nx, ny);
                    visited[nx][ny] = 0;
                }
            }
        }
    }
}
