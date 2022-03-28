package codingtest.inflearn.bfs;

import codingtest.Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토 {
    static int[][] arr;
    static int day = 1;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public void solution(int M, int N){
        BFS(M, N);
        int maxNum = -1;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j] > maxNum) maxNum = arr[i][j];
                if(arr[i][j]==0) {
                    break;
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
            int len = queue.size();
            for(int i=0; i<len; i++){
                Position pos = queue.poll();
                for(int j=0; j<4; j++){
                    int nx = pos.x + dx[j];
                    int ny = pos.y + dy[j];
                    if(nx>=0 && nx<N && ny>=0 && ny<M && arr[nx][ny]==0){
                        arr[nx][ny] = day;
                        queue.offer(new Position(nx, ny));
                    }
                }
            }
            day++;
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
