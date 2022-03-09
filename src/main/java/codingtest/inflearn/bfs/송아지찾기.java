package codingtest.inflearn.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class 송아지찾기 {
    public int BFS(int pos, int cow) {
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[10001];
        int[] dis = {-1, 1, 5};
        int level = 0;
        visited[pos] = 1;
        queue.offer(pos);

        while (!queue.isEmpty()){
            int len = queue.size();
            for(int i=0; i<len; i++){

                int cur = queue.poll();
                if(cur==cow) return level;

                for(int j=0; j<dis.length; j++){
                    int nx = cow + dis[j];
                    if(nx>=1 && nx <=10000 && visited[nx]==0) {
                        visited[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public int BFS2(int pos, int cow) {
        int cnt = 0;
        int answer = Integer.MAX_VALUE;
        int[] visited = new int[cow+6];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(pos);

        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0; i<len; i++){
                int cur = queue.poll();
                if(visited[cur]==1) continue;
                visited[cur] = 1;

                if(cur==cow) {
                    answer = Math.min(cnt, answer);
                }
                if(cur<cow) queue.offer(cur+1);
                if(cur>cow) queue.offer(cur-1);
                if(cur<cow) queue.offer(cur+5);
            }
            cnt++;
        }
        return answer;
    }
}
