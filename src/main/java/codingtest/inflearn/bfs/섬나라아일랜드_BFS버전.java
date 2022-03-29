package codingtest.inflearn.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class 섬나라아일랜드_BFS버전 {
    static int[][] arr, visited;
    static int answer = 0;
    static int[] dx = {0, 0, 1, -1, 1, -1, 1, -1};
    static int[] dy = {1, -1, 0, 0, 1, -1, -1, 1};

    public void solution(int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(visited[i][j]==0 && arr[i][j]==1){
                    visited[i][j] = 1;
                    BFS(i, j, N);
                    answer++;
                }
            }
        }
    }

    public void BFS(int x, int y, int N){
        Queue<Point> queue = new LinkedList<>();

        queue.offer(new Point(x, y));

        while(!queue.isEmpty()) {
            Point point = queue.poll();
            for(int i=0; i<8; i++){
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if(nx>=0 && nx < N && ny>=0 && ny < N && arr[nx][ny]==1 && visited[nx][ny]==0){
                    visited[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
    }

    static class Point{
        int x, y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
