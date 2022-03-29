package codingtest.inflearn.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class 토마토 {
    static int[][] arr, dis;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public void solution(int M, int N){
        boolean flag = true;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if (arr[i][j] == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if(flag) {
            System.out.println(0);
            return;
        }
        BFS(M, N);
        int maxNum = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(dis[i][j] > maxNum) maxNum = dis[i][j];
                if(arr[i][j]==0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(maxNum);
    }

    public void BFS(int M, int N){
        Queue<Position> queue = new LinkedList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]==1)
                    queue.offer(new Position(i, j));
            }
        }

        while(!queue.isEmpty()){
            Position pos = queue.poll();
            for(int j=0; j<4; j++){
                int nx = pos.x + dx[j];
                int ny = pos.y + dy[j];
                if(nx>=0 && nx<N && ny>=0 && ny<M && arr[nx][ny]==0){
                    arr[nx][ny] = 1;
                    dis[nx][ny] = dis[pos.x][pos.y] + 1;
                    queue.offer(new Position(nx, ny));
                }
            }
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
