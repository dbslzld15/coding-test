package codingtest.inflearn.bfs;

import codingtest.Main;

import java.util.LinkedList;
import java.util.Queue;

public class 미로의최단거리통로 {
    static int[][] arr;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] dis;
    
    private void solution() {
        BFS(0, 0);
    }

    public void BFS(int x, int y){
        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(x, y));
        arr[x][y] = 1;
        while (!queue.isEmpty()){
            Position pos = queue.poll();
            for(int i=0; i<4; i++){
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];
                if(nx>=0 && nx <7 && ny>=0 && ny < 7 && arr[nx][ny]==0){
                    arr[nx][ny] = 1;
                    dis[nx][ny] = dis[pos.x][pos.y] + 1;
                    queue.offer(new Position(nx, ny));
                }
            }
        }
    }

    public void BFS2(int x, int y) {
        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(x, y));
        int distance = 1;

        while (!queue.isEmpty()){
            int len = queue.size();
            for(int j=0; j<len; j++){
                Position pos = queue.poll();
                for(int i=0; i<4; i++){
                    int nx = pos.x + dx[i];
                    int ny = pos.y + dy[i];
                    if(nx>=0 && nx <7 && ny>=0 && ny < 7 && arr[nx][ny]==0){
                        arr[nx][ny] = distance;
                        queue.offer(new Position(nx, ny));
                    }
                }
            }
            distance++;
        }
    }


    static class Position {
        int x, y;

        Position(int x, int y){
            this.x = x;
            this.y= y;
        }

    }
}
